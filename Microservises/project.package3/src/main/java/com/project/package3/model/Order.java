package com.project.package3.model;

import java.time.LocalDate;

public class Order {

	private int orderid;
	private int proId;
	private double pType;
	private LocalDate date;
	private double orderAmount;
	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getProId() {
		return proId;
	}
	public void setProId(int proId) {
		this.proId = proId;
	}
	public double getpType() {
		return pType;
	}
	public void setpType(double pType) {
		this.pType = pType;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	
	
}
