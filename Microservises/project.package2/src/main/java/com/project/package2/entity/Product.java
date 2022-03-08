package com.project.package2.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_tbl")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ProductId")
	private int pid;
	
	@Column(name="ProductName")
	private String pName;
	
	@Column(name="ProductPrice")
	private double pPrice;
	
	@Column(name="ProductCreatedOn")
	private LocalDate createdOn;
	
	@Column(name="IntrestRate")
	private int intrest;
	
	@Column(name="ProductDuration")
	private int duration;
	
	@Column(name="MaturityAmount")
	private int MaturityAmount;
	
	@Column(name="FixedMaturityAmount")
	private int FixedMaturityAmount;
	
	@Column(name="PremiumType")
	private int PremiumType;
	
	@Column(name="Description")
	private String description;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public double getpPrice() {
		return pPrice;
	}

	public void setpPrice(double pPrice) {
		this.pPrice = pPrice;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}

	public int getIntrest() {
		return intrest;
	}

	public void setIntrest(int intrest) {
		this.intrest = intrest;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getMaturityAmount() {
		return MaturityAmount;
	}

	public void setMaturityAmount(int maturityAmount) {
		MaturityAmount = maturityAmount;
	}

	public int getFixedMaturityAmount() {
		return FixedMaturityAmount;
	}

	public void setFixedMaturityAmount(int fixedMaturityAmount) {
		FixedMaturityAmount = fixedMaturityAmount;
	}

	public int getPremiumType() {
		return PremiumType;
	}

	public void setPremiumType(int premiumType) {
		PremiumType = premiumType;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
	

}