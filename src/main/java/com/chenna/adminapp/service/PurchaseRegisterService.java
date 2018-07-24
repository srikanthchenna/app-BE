package com.chenna.adminapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.chenna.adminapp.dao.PurchaseRegisterDao;
import com.chenna.adminapp.entity.PurchaseRegister;

@Service
public class PurchaseRegisterService {
	
	@Autowired
	private PurchaseRegisterDao purchaseRegisterDao;
	
	public PurchaseRegister createPurchase(PurchaseRegister purchaseRegister) {
		return purchaseRegisterDao.save(purchaseRegister);
	}
	
	public Iterable<PurchaseRegister> findAll(){
		return purchaseRegisterDao.findAll();
	}

	public Iterable<PurchaseRegister> findAll(Pageable pageable) {
		return purchaseRegisterDao.findAll();
	}
}
