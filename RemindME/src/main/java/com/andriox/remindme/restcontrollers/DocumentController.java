package com.andriox.remindme.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.andriox.remindme.dtos.DocumentDTO;
import com.andriox.remindme.exceptions.RemindMeException;
import com.andriox.remindme.restmodels.ResponseTO;
import com.andriox.remindme.services.DocumentService;

@RestController
@RequestMapping(value = "/documents")
public class DocumentController {

	@Autowired
	private DocumentService documentService;

	@RequestMapping(value = "/save", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody
	ResponseTO saveDocument(@RequestBody DocumentDTO documentDTO) {
		documentService.saveDocument(documentDTO);
		return new ResponseTO("success", documentDTO);
	}

	@RequestMapping(value = "/find", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody
	ResponseTO findById(@RequestParam(value = "id") Integer id) {
		DocumentDTO documentDTO = null;
		try {
			documentDTO = documentService.findById(id);
			return new ResponseTO("success", documentDTO);
		} catch (RemindMeException e) {
			return new ResponseTO("failure", e.getMessage());
		}
	}

	@RequestMapping(value = "/fetchAll", method = RequestMethod.POST, consumes = "application/json")
	public @ResponseBody
	ResponseTO fetchAll() {
		List<DocumentDTO> documents = documentService.fetchAll();
		return new ResponseTO("success", documents);

	}

}
