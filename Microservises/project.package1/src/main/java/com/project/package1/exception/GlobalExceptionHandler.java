package com.project.package1.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

public class GlobalExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler(CustomerNotFoundExceptioin.class)
	public ResponseEntity<String> handleCustomertNotExistingException(Exception e) {		
		ResponseEntity<String> responseEntity= new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
		return responseEntity;
	}
}
