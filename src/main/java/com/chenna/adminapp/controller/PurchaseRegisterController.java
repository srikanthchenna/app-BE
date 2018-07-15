package com.chenna.adminapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.chenna.adminapp.entity.PurchaseRegister;
import com.chenna.adminapp.service.PurchaseRegisterService;

@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping(value = "/purchaseRegister")
public class PurchaseRegisterController {

	@Autowired
	private PurchaseRegisterService purchaseRegisterService;

	@RequestMapping(value = "/createPurchase", method = RequestMethod.POST)
	public ResponseEntity<String> createPurchase(@RequestBody PurchaseRegister purchaseRegister) {
		System.out.println(purchaseRegister.toString());
		purchaseRegisterService.createPurchase(purchaseRegister);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	}
	
	@RequestMapping(value = "/createPurchas", method = RequestMethod.GET)
	public String createPurchase() {
		//System.out.println(purchaseRegister.toString());
		//return purchaseRegisterService.createPurchase(purchaseRegister);
		return "string";
	}

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public Iterable<PurchaseRegister> findAllPurchases() {
		return purchaseRegisterService.findAll();
	}
}
