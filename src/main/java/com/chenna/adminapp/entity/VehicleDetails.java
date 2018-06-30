package com.chenna.adminapp.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "vehicle_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VehicleDetails {
	
	@Id
	@GeneratedValue
	private BigDecimal id;
	@Column(name = "vehicle_no")
	private String vehicleNo;
	@Column(name = "weight_slip")
	private String weightSlip;
	@Column(name = "empty_weight")
	private BigDecimal emptyWeight;
	@Column(name = "load_weight")
	private BigDecimal loadWeight;
	@Column(name = "tare_weight")
	private BigDecimal tareWeight;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "updated_date")
	private Date updatedDate;
	@Column(name = "retired")
	private boolean retired;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public String getVehicleNo() {
		return vehicleNo;
	}

	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}

	public String getWeightSlip() {
		return weightSlip;
	}

	public void setWeightSlip(String weightSlip) {
		this.weightSlip = weightSlip;
	}

	public BigDecimal getEmptyWeight() {
		return emptyWeight;
	}

	public void setEmptyWeight(BigDecimal emptyWeight) {
		this.emptyWeight = emptyWeight;
	}

	public BigDecimal getLoadWeight() {
		return loadWeight;
	}

	public void setLoadWeight(BigDecimal loadWeight) {
		this.loadWeight = loadWeight;
	}

	public BigDecimal getTareWeight() {
		return tareWeight;
	}

	public void setTareWeight(BigDecimal tareWeight) {
		this.tareWeight = tareWeight;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

	public boolean isRetired() {
		return retired;
	}

	public void setRetired(boolean retired) {
		this.retired = retired;
	}

}
