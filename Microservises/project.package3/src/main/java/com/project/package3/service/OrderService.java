package com.project.package3.service;

import com.project.package3.entity.Order;

public interface OrderService {

	 Order saveOrder(Order order);
	  
	 Order viewOrder(int orderId);
			 
}
