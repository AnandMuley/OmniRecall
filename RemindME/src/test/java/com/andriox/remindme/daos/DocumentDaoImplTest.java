package com.andriox.remindme.daos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.andriox.remindme.models.DocumentEntity;

@ContextConfiguration(locations = { "classpath:dbconfig/test-config.xml" })
public class DocumentDaoImplTest extends AbstractTestNGSpringContextTests {

	@Autowired
	private DocumentDao documentDao;

	public void saveDocumentTest() {
		DocumentEntity document = new DocumentEntity("name", "description");
		DocumentEntity actual = documentDao.saveDocument(document);
		Assert.assertNotNull(actual.getId());
	}

	@Test
	public void saveDocumentNoneTest() {
		DocumentEntity document = null;
		documentDao.saveDocument(document);
		Assert.fail("Need Modification");
	}

	@Test
	public void findDocumentByIdTest() {
		final int id = 101;
		DocumentEntity expected = new DocumentEntity("Name", "Desc");
		DocumentEntity actual = documentDao.findById(id);
		Assert.assertEquals(actual.getName(), expected.getName());
		Assert.assertEquals(actual.getDescription(), expected.getDescription());
	}

}
