package com.project.package3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.package3.entity.Order;
import com.project.package3.service.OrderService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@PostMapping("/add")
	public ResponseEntity<Order> addCustomer(@RequestBody Order order)
	{
		Order newOrder=orderService.saveOrder(order);
		
		ResponseEntity<Order> responseEntity = new ResponseEntity<Order>(newOrder,HttpStatus.CREATED);
		return responseEntity;
		
	}
	
	@GetMapping("/get/{oid}")
	public ResponseEntity<?> fetchAllCustomer(@PathVariable("oid") int orderId)
	{
		Order customer=orderService.viewOrder(orderId);
		return new ResponseEntity<>(customer, HttpStatus.OK);
		
	}
}
