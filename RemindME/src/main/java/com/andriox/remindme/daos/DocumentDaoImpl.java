package com.andriox.remindme.daos;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andriox.remindme.models.Document;

@Repository
public class DocumentDaoImpl implements DocumentDao {

	@Autowired
	private SessionFactory factory;

	public int saveDocument(Document document) {
		return 0;
	}

	public Document findById(int id) {
		return null;
	}

	public int deleteDocument(Document document) {
		return 0;
	}

}
