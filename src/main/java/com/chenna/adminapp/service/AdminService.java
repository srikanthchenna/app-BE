package com.chenna.adminapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chenna.adminapp.dao.AdminDao;

@Component
public class AdminService {
	
	@Autowired
	private AdminDao adminDao;

}
