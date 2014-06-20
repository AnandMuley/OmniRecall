package com.andriox.remindme.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.andriox.remindme.daos.DocumentDao;
import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.models.DocumentEntity;
import com.andriox.remindme.utils.DtoCreatorUtil;
import com.andriox.remindme.utils.EntityCreatorUtil;

@Service
public class DocumentServiceImpl implements DocumentService {

	@Autowired
	private DocumentDao documentDao;

	@Autowired
	private EntityCreatorUtil entityCreatorUtil;

	@Autowired
	private DtoCreatorUtil dtoCreatorUtil;

	public void saveDocument(DocumentDTO documentDTO) {
		DocumentEntity documentEntity = entityCreatorUtil
				.createDocEntity(documentDTO);
		documentDao.saveDocument(documentEntity);
		documentDTO.setId(documentEntity.getId());
	}

	public DocumentDTO findById(int id) {
		DocumentEntity documentEntity = documentDao.findById(id);
		DocumentDTO documentDTO = dtoCreatorUtil
				.createDocumentDto(documentEntity);
		return documentDTO;
	}

	public void deleteDocument(int id) {
		DocumentEntity documentEntity = documentDao.findById(id);
		documentDao.deleteDocument(documentEntity);
	}

}
