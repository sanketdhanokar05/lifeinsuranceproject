package com.project.package1.model;

import java.time.LocalDate;

public class Nominee {

	private int id;
	private String name;
	private char gender;
	private LocalDate dob;
	private int age;
	private int num;
	private String email;
	private String address;
	private int govt_Id;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getGovt_Id() {
		return govt_Id;
	}
	public void setGovt_Id(int govt_Id) {
		this.govt_Id = govt_Id;
	}
	
}
