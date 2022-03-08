package com.project.package3.model;

import java.time.LocalDate;

public class OrderModel {

	private int orderid;
	private int productId;
	private double premiumType;
	private LocalDate buyDate;
	private double orderAmount;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
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
