package com.chenna.adminapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "product_type")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class ProductType {

	@Id
	@Column(name = "type")
	private String type;
	@Column(name = "retired")
	private boolean retired;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

}
