package com.chenna.adminapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chenna.adminapp.entity.StockDetails;

public interface StockDetailsInterface extends JpaRepository< StockDetails, Long >{

}
