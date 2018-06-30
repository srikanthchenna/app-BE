package com.chenna.adminapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chenna.adminapp.dao.PurchaseRegisterDao;
import com.chenna.adminapp.entity.PurchaseRegister;

@Service
public class PurchaseRegisterService {
	
	@Autowired
	private PurchaseRegisterDao purchaseRegisterDao;
	
	public Iterable<PurchaseRegister> findAll(){
		return purchaseRegisterDao.findAll();
	}

}