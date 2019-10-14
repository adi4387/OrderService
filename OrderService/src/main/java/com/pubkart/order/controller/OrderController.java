package com.pubkart.order.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pubkart.order.feign.OrderService;
import com.pubkart.order.model.Order;

@RestController
public class OrderController {

	@Autowired
	OrderService catalogService;
	
	
	@GetMapping("/catalog")
	public List<Order> getCatalog() {
		Order o = new Order();
	
		return catalogService.getCatalog();
	}
	
}
