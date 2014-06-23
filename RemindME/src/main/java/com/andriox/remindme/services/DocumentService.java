package com.andriox.remindme.services;

import java.util.List;

import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.exceptions.RemindMeException;

public interface DocumentService {
	void saveDocument(DocumentDTO documentDTO);

	DocumentDTO findById(int id) throws RemindMeException;

	void deleteDocument(int id);

	List<DocumentDTO> fetchAll();
}
