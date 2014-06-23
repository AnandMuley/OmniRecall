package com.andriox.remindme.utils;

import org.springframework.stereotype.Component;

import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.models.DocumentEntity;

@Component
public class EntityCreatorUtil {

	public DocumentEntity createDocEntity(DocumentDTO documentDTO) {
		DocumentEntity documentEntity = new DocumentEntity(
				documentDTO.getName(), documentDTO.getDescription());
		return documentEntity;
	}

}
