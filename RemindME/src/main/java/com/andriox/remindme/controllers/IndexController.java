package com.andriox.remindme.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping
	public String renderIndex() {
		System.out.println("Rendering Index...");
		return "Index";
	}

}
