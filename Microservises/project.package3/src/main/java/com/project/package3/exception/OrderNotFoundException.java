package com.project.package3.exception;

public class OrderNotFoundException extends RuntimeException{

	public OrderNotFoundException(String str){
		super(str);
	}
}