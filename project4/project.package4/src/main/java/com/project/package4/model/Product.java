package com.project.package4.model;

import java.time.LocalDate;

public class Product {
	
	private int  productId;
	
	private String productName;
	
	private String pDescription;
	
	private double productAmount;
	
	private String premiumType ;
	
	private double maturityAmount;
	
	private double fixedaturityAmount;
	
	private LocalDate createdOn;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getpDescription() {
		return pDescription;
	}

	public void setpDescription(String pDescription) {
		this.pDescription = pDescription;
	}

	public double getProductAmount() {
		return productAmount;
	}

	public void setProductAmount(double productAmount) {
		this.productAmount = productAmount;
	}

	public String getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(String premiumType) {
		this.premiumType = premiumType;
	}

	public double getMaturityAmount() {
		return maturityAmount;
	}

	public void setMaturityAmount(double maturityAmount) {
		this.maturityAmount = maturityAmount;
	}

	public double getFixedaturityAmount() {
		return fixedaturityAmount;
	}

	public void setFixedaturityAmount(double fixedaturityAmount) {
		this.fixedaturityAmount = fixedaturityAmount;
	}

	public LocalDate getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(LocalDate createdOn) {
		this.createdOn = createdOn;
	}
}