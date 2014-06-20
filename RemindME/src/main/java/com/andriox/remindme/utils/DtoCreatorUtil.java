package com.andriox.remindme.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.models.DocumentEntity;

@Component
public class DtoCreatorUtil {

	@Autowired
	private ApplicationContext context;

	public DocumentDTO createDocumentDto(DocumentEntity documentEntity) {
		DocumentDTO documentDTO = context.getBean(DocumentDTO.class);
		documentDTO.setDescription(documentEntity.getDescription());
		documentDTO.setName(documentEntity.getName());
		return documentDTO;
	}

}
