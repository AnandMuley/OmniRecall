package com.andriox.remindme.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.restmodels.DocumentResponseTO;
import com.andriox.remindme.services.DocumentService;

@RestController
@RequestMapping(value = "documents")
public class DocumentController {

	@Autowired
	private DocumentService documentService;

	@Autowired
	private DocumentResponseTO documentResponseTO;

	@RequestMapping(value = "save")
	public DocumentResponseTO saveDocument(@RequestBody DocumentDTO documentDTO) {
		documentService.saveDocument(documentDTO);
		documentResponseTO.setMessage("Success");
		return documentResponseTO;
	}

}
