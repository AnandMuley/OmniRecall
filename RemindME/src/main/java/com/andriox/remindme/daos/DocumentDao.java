package com.andriox.remindme.daos;

import java.util.List;

import com.andriox.remindme.models.DocumentEntity;

public interface DocumentDao {

	DocumentEntity saveDocument(DocumentEntity document);

	DocumentEntity findById(int id);

	void deleteDocument(DocumentEntity document);

	List<DocumentEntity> fetchAll();

}
