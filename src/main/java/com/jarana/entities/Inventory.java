package com.jarana.entities;
// Generated Feb 21, 2017 10:30:35 PM by Hibernate Tools 5.2.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Inventory generated by hbm2java
 */
@Entity
@Table(name = "Inventory", catalog = "ecomm")
public class Inventory implements java.io.Serializable {

	private String inLocation;
	private Part part;
	private Integer inQuantityOnHand;

	public Inventory() {
	}

	public Inventory(String inLocation) {
		this.inLocation = inLocation;
	}

	public Inventory(String inLocation, Part part, Integer inQuantityOnHand) {
		this.inLocation = inLocation;
		this.part = part;
		this.inQuantityOnHand = inQuantityOnHand;
	}

	@Id

	@Column(name = "in_location", unique = true, nullable = false, length = 12)
	public String getInLocation() {
		return this.inLocation;
	}

	public void setInLocation(String inLocation) {
		this.inLocation = inLocation;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "in_sku_number")
	public Part getPart() {
		return this.part;
	}

	public void setPart(Part part) {
		this.part = part;
	}

	@Column(name = "in_quantity_on_hand")
	public Integer getInQuantityOnHand() {
		return this.inQuantityOnHand;
	}

	public void setInQuantityOnHand(Integer inQuantityOnHand) {
		this.inQuantityOnHand = inQuantityOnHand;
	}

}
