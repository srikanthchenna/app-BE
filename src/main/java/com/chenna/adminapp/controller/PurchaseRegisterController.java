package com.chenna.adminapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chenna.adminapp.entity.PurchaseRegister;
import com.chenna.adminapp.service.PurchaseRegisterService;

@RestController
@RequestMapping(value = "/purchaseRegister")
public class PurchaseRegisterController {
	
	@Autowired
	private PurchaseRegisterService purchaseRegisterService;
	
	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public Iterable<PurchaseRegister> userDetails() {
		return purchaseRegisterService.findAll();
	}
}
