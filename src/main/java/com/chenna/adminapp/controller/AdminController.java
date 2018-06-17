package com.chenna.adminapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chenna.adminapp.service.AdminService;

@RestController
public class AdminController {

	@Autowired
	private AdminService adminService;

	@RequestMapping(value = "/userDetails", method = RequestMethod.GET)
	public String userDetails() {
		return "user";
	}

}
