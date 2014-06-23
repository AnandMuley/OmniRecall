package com.andriox.remindme.utils;

import org.springframework.stereotype.Component;

import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.models.DocumentEntity;

@Component
public class DtoCreatorUtil {

	public DocumentDTO createDocumentDto(DocumentEntity documentEntity) {
		DocumentDTO documentDTO = new DocumentDTO(documentEntity.getId(),
				documentEntity.getName(), documentEntity.getDescription());
		return documentDTO;
	}

}
