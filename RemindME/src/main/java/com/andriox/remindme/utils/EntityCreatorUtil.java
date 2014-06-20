package com.andriox.remindme.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.models.DocumentEntity;

@Component
public class EntityCreatorUtil {

	@Autowired
	private ApplicationContext context;

	public DocumentEntity createDocEntity(DocumentDTO documentDTO) {
		DocumentEntity documentEntity = context.getBean(DocumentEntity.class);
		documentEntity.setDescription(documentDTO.getDescription());
		documentEntity.setName(documentDTO.getName());
		return documentEntity;
	}

}
