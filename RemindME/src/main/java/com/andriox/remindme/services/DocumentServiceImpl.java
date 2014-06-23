package com.andriox.remindme.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.andriox.remindme.daos.DocumentDao;
import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.exceptions.RemindMeException;
import com.andriox.remindme.models.DocumentEntity;
import com.andriox.remindme.utils.DtoCreatorUtil;
import com.andriox.remindme.utils.EntityCreatorUtil;

@Service
@Transactional(readOnly = true)
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentDao documentDao;

	@Autowired
	private EntityCreatorUtil entityCreatorUtil;

	@Autowired
	private DtoCreatorUtil dtoCreatorUtil;

	@Transactional(readOnly = false)
	public void saveDocument(DocumentDTO documentDTO) {
		DocumentEntity documentEntity = entityCreatorUtil
				.createDocEntity(documentDTO);
		documentDao.saveDocument(documentEntity);
		documentDTO.setId(documentEntity.getId());
	}

	public DocumentDTO findById(int id) throws RemindMeException {
		DocumentDTO documentDTO = null;
		try {
			DocumentEntity documentEntity = documentDao.findById(id);
			documentDTO = dtoCreatorUtil.createDocumentDto(documentEntity);
		} catch (IndexOutOfBoundsException exp) {
			throw new RemindMeException("No Data Found", exp);
		}
		return documentDTO;
	}

	@Transactional(readOnly = false)
	public void deleteDocument(int id) {
		DocumentEntity documentEntity = documentDao.findById(id);
		documentDao.deleteDocument(documentEntity);
	}

	public List<DocumentDTO> fetchAll() {
		List<DocumentEntity> documents = documentDao.fetchAll();
		List<DocumentDTO> documentDtos = new ArrayList<DocumentDTO>();
		for (DocumentEntity documentEntity : documents) {
			DocumentDTO documentDTO = dtoCreatorUtil
					.createDocumentDto(documentEntity);
			documentDtos.add(documentDTO);
		}
		return documentDtos;
	}

}
