package com.chenna.adminapp.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "purchase_register")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PurchaseRegister {
	@Id
	@GeneratedValue
	private BigDecimal id;
	@Column(name = "sno")
	private String sno;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vehicle_id")
	private VehicleDetails vehicleDetails;

	@Column(name = "aasami_name")
	private String aasamiName;
	@Column(name = "broker_name")
	private String brokerName;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_name")
	private ProductType productType;

	@Column(name = "bags_count")
	private BigDecimal bagsCount;
	@Column(name = "quantity")
	private BigDecimal quantity;
	@Column(name = "quantity_unit")
	private String quantityUnit;
	@Column(name = "price_per_quintals")
	private BigDecimal pricePerQuintals;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "purcahse_adj_id")
	private PurchaseAdjustments purchaseAdjustments;

	@Column(name = "final_settlement")
	private BigDecimal final_settlement;
	@Column(name = "status")
	private String status;
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

	public String getSno() {
		return sno;
	}

	public void setSno(String sno) {
		this.sno = sno;
	}

	public VehicleDetails getVehicleDetails() {
		return vehicleDetails;
	}

	public void setVehicleDetails(VehicleDetails vehicleDetails) {
		this.vehicleDetails = vehicleDetails;
	}

	public String getAasamiName() {
		return aasamiName;
	}

	public void setAasamiName(String aasamiName) {
		this.aasamiName = aasamiName;
	}

	public String getBrokerName() {
		return brokerName;
	}

	public void setBrokerName(String brokerName) {
		this.brokerName = brokerName;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public BigDecimal getBagsCount() {
		return bagsCount;
	}

	public void setBagsCount(BigDecimal bagsCount) {
		this.bagsCount = bagsCount;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public BigDecimal getPricePerQuintals() {
		return pricePerQuintals;
	}

	public void setPricePerQuintals(BigDecimal pricePerQuintals) {
		this.pricePerQuintals = pricePerQuintals;
	}

	public PurchaseAdjustments getPurchaseAdjustments() {
		return purchaseAdjustments;
	}

	public void setPurchaseAdjustments(PurchaseAdjustments purchaseAdjustments) {
		this.purchaseAdjustments = purchaseAdjustments;
	}

	public BigDecimal getFinal_settlement() {
		return final_settlement;
	}

	public void setFinal_settlement(BigDecimal final_settlement) {
		this.final_settlement = final_settlement;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
