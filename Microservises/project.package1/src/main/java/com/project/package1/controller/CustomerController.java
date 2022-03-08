package com.project.package1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.package1.entity.Customer;
import com.project.package1.entity.Nominee;
import com.project.package1.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@PostMapping("/addNominee")
	public ResponseEntity<Nominee> addNominee(@RequestBody Nominee nominee) {
		Nominee newNominee = customerService.addNominee(nominee);

		ResponseEntity<Nominee> responseEntity = new ResponseEntity<Nominee>(newNominee, HttpStatus.CREATED);
		return responseEntity;
	}

	@PostMapping("/updateCustomer")
	public ResponseEntity<Customer> updated(@RequestBody Customer customer) {
		Customer updatedCustomer = customerService.updateProfile(customer);

		ResponseEntity<Customer> responseEntity = new ResponseEntity<Customer>(updatedCustomer, HttpStatus.OK);
		return responseEntity;
	}

}
