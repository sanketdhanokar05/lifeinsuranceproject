package com.project.package3.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Order_tbl123")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="OrderId")
	private int orderId;

	@Column(name="ProductId")
	private int productId;
	
	@Column(name="Premiumtype")
	private double premiumType;
	 
	@Column(name="BuyDate")
	private LocalDate buyDate;
	
	@Column(name="OrderAmount")
	private double orderAmount;

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public double getPremiumType() {
		return premiumType;
	}

	public void setPremiumType(double premiumType) {
		this.premiumType = premiumType;
	}

	public LocalDate getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(LocalDate buyDate) {
		this.buyDate = buyDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
	
}
