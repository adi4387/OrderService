package com.pubkart.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pubkart.order.model.Cart;
import com.pubkart.order.service.OrderService;

@RestController
@RequestMapping("/order-service")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	
	@GetMapping("/createOrder")
	public String  createOrder(@RequestBody Cart cart) {
		
		return orderService.createOrder(cart);
		
		
		
		
	}
	
}
