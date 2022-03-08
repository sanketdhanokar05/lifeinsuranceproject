package com.project.package2.exception;

public class ProductNotFoundException extends RuntimeException{

	public ProductNotFoundException(String str){
		super(str);
	}
}
