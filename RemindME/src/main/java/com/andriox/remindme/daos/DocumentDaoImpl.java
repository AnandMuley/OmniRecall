package com.andriox.remindme.daos;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.andriox.remindme.models.DocumentEntity;

@Repository
public class DocumentDaoImpl implements DocumentDao {

	@Autowired
	private SessionFactory factory;

	public DocumentEntity saveDocument(DocumentEntity document) {
		factory.getCurrentSession().save(document);
		return document;
	}

	@SuppressWarnings("unchecked")
	public DocumentEntity findById(int id) {
		Criteria criteria = factory.getCurrentSession().createCriteria(
				DocumentEntity.class);
		criteria.add(Restrictions.eq("id", id));
		List<DocumentEntity> docs = criteria.list();
		return docs.get(0);
	}

	public void deleteDocument(DocumentEntity document) {
		factory.getCurrentSession().delete(document);
	}

	@SuppressWarnings("unchecked")
	public List<DocumentEntity> fetchAll() {
		Criteria criteria = factory.getCurrentSession().createCriteria(
				DocumentEntity.class);
		List<DocumentEntity> docs = criteria.list();
		return docs;
	}

}
