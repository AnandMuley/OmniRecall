package com.andriox.remindme.daos;

import com.andriox.remindme.models.DocumentEntity;

public interface DocumentDao {

	DocumentEntity saveDocument(DocumentEntity document);

	DocumentEntity findById(int id);

	void deleteDocument(DocumentEntity document);

}
