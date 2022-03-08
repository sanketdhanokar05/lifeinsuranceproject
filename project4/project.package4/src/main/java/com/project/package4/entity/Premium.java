package com.project.package4.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tiger")
public class Premium {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Premium_Id")
	private int premiumId;
	
	@Column(name = "Customer_Id")
	private int customerId;

	@Column(name = "Premium_Amount")
	private double premiumAmount;

	@Column(name = "Date_of_Paid")
	private LocalDate paidDate;

	@Column(name = "Product_Id")
	private int productId;

	@Column(name = "Next_Due_Date")
	private LocalDate dueDate;

	@Column(name = "Status")
	private String status;

	public int getPremiumId() {
		return premiumId;
	}

	public void setPremiumId(int premiumId) {
		this.premiumId = premiumId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public LocalDate getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDate paidDate) {
		this.paidDate = paidDate;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

	
}
