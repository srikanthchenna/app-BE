package com.chenna.adminapp.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "purchase_adjustments")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class PurchaseAdjustments {

	@Id
	@GeneratedValue
	private BigDecimal id;
	@Column(name = "bags_cost")
	private BigDecimal bagsCost;
	@Column(name = "weight_bridge_cost")
	private BigDecimal weightBridgeCost;
	@Column(name = "kulli")
	private BigDecimal kulli;
	@Column(name = "misc_cost")
	private BigDecimal miscCost;
	@Column(name = "labour_cost")
	private BigDecimal labourCost;

	public BigDecimal getId() {
		return id;
	}

	public void setId(BigDecimal id) {
		this.id = id;
	}

	public BigDecimal getBagsCost() {
		return bagsCost;
	}

	public void setBagsCost(BigDecimal bagsCost) {
		this.bagsCost = bagsCost;
	}

	public BigDecimal getWeightBridgeCost() {
		return weightBridgeCost;
	}

	public void setWeightBridgeCost(BigDecimal weightBridgeCost) {
		this.weightBridgeCost = weightBridgeCost;
	}

	public BigDecimal getKulli() {
		return kulli;
	}

	public void setKulli(BigDecimal kulli) {
		this.kulli = kulli;
	}

	public BigDecimal getMiscCost() {
		return miscCost;
	}

	public void setMiscCost(BigDecimal miscCost) {
		this.miscCost = miscCost;
	}

	public BigDecimal getLabourCost() {
		return labourCost;
	}

	public void setLabourCost(BigDecimal labourCost) {
		this.labourCost = labourCost;
	}

}
