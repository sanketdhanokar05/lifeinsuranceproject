package com.project.package2.model;

import java.time.LocalDate;

public class Product {

    private int pid;
	private String pName;
	private double pPrice;
    private LocalDate createdOn;
	private int intrest;
	private int duration;
	private int MaturityAmount;
	private int FixedMaturityAmount;
	private int PremiumType;
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
