package com.chenna.adminapp.entity;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@Entity
@Table(name = "purchase_register")
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" }, ignoreUnknown = true)
@JsonInclude(Include.NON_NULL)
public class PurchaseRegister {
	@Id
	@GeneratedValue
	private BigDecimal id;
	@Column(name = "sno")
	private String sno;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
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

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinColumn(name = "purcahse_adj_id")
	private PurchaseAdjustments purchaseAdjustments;

	@Column(name = "final_settlement")
	private BigDecimal finalSettlement;
	@Column(name = "status")
	private String status;
	@Column(name = "created_date")
	@CreationTimestamp
	private Date createdDate;
	@Column(name = "updated_date")
	@UpdateTimestamp
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

	public BigDecimal getFinalSettlement() {
		return finalSettlement;
	}

	public void setFinalSettlement(BigDecimal finalSettlement) {
		this.finalSettlement = finalSettlement;
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

	@Override
	public String toString() {
		return "PurchaseRegister [id=" + id + ", sno=" + sno + ", vehicleDetails=" + vehicleDetails + ", aasamiName="
				+ aasamiName + ", brokerName=" + brokerName + ", productType=" + productType + ", bagsCount="
				+ bagsCount + ", quantity=" + quantity + ", quantityUnit=" + quantityUnit + ", pricePerQuintals="
				+ pricePerQuintals + ", purchaseAdjustments=" + purchaseAdjustments + ", finalSettlement="
				+ finalSettlement + ", status=" + status + ", createdDate=" + createdDate + ", updatedDate="
				+ updatedDate + ", retired=" + retired + "]";
	}

}
