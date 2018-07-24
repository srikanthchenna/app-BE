package com.chenna.adminapp.dao;

import java.sql.Date;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;

import com.chenna.adminapp.entity.PurchaseRegister;

public interface PurchaseRegisterDao extends CrudRepository<PurchaseRegister, Long> {

	List<PurchaseRegister> findBySno(String sno);

	List<PurchaseRegister> findByCreatedDate(Date date);

	Iterable<PurchaseRegister> findAll(Pageable pageable);

}
