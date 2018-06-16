package com.chenna.adminapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {

	@RequestMapping(value = "/userDetails", method = RequestMethod.GET)
	public String userDetails() {
		return "user";
	}

}
