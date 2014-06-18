package com.andriox.remindme.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.andriox.remindme.models.Document;

@ContextConfiguration(locations = { "classpath:dbconfig/test-config.xml" })
public class DocumentDaoImplTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private DocumentDao documentDao;

	@Test
	public void saveDocumentTest() {
		Document document = new Document("name", "description");
		int actual = documentDao.saveDocument(document);
		Assert.assertEquals(actual, 1);
	}

	@Test
	public void saveDocumentNoneTest() {
		Document document = null;
		int actual = documentDao.saveDocument(document);
		Assert.assertEquals(actual, 0);
	}

	@Test
	public void findDocumentByIdTest() {
		final int id = 101;
		Document expected = new Document("Name", "Desc");
		Document actual = documentDao.findById(id);
		Assert.assertEquals(actual.getName(), expected.getName());
		Assert.assertEquals(actual.getDescription(), expected.getDescription());
	}

}
