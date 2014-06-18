package com.andriox.remindme.daos;

import com.andriox.remindme.models.Document;

public interface DocumentDao {

	int saveDocument(Document document);

	Document findById(int id);

	int deleteDocument(Document document);

}
