package com.chenna.adminapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class StockDetailsController {
	
	
	@RequestMapping(value = "/userDetails", method = RequestMethod.GET)
	public String userDetails() {
		return "user";
	}
}
