package com.project.package3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.package3.entity.Order;
import com.project.package3.exception.OrderNotFoundException;
import com.project.package3.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{


	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order saveOrder(Order order) {
		Order savedOrder=orderRepository.save(order);
		return savedOrder;
	}

	@Override
	public Order viewOrder(int orderId) {
		Optional<Order> optionalOrder=orderRepository.findById(orderId);
		if(!optionalOrder.isPresent()) {
			throw new OrderNotFoundException("Sorry! Order is not existing with id: "+orderId);
		}

		return optionalOrder.get();
	}

	
//	public Order addOrder(Order order)
//	{
//		order.setOrderDate(LocalDate.now());
//		int productId=order.getProductId();
//		
//		Optional<Product> optionalProduct = productRepository.findById(productId);
//		if(optionalProduct.isEmpty()) {
//			throw new ProductNotFoundException("Product not Existing with id "+productId);
//		}
//		else {
//			Product product=optionalProduct.get();
//			double unitPrice= product.getProductPrice();
//			double orderAmount=order.getQuantity()*unitPrice;
//			order.setOrderAmount(orderAmount);
//		}
//		
//		Order newOrder = orderRepository.save(order);
//		return newOrder;
//	}
}
