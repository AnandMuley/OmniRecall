package com.andriox.remindme.services;

import com.andriox.remindme.dtos.DocumentDTO;

public interface DocumentService {
	void saveDocument(DocumentDTO documentDTO);

	DocumentDTO findById(int id);

	void deleteDocument(int id);
}
