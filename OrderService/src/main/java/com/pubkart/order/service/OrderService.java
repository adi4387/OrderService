package com.pubkart.order.service;

import org.springframework.stereotype.Service;

import com.pubkart.order.model.Cart;

@Service
public interface OrderService {
	
	public String createOrder(Cart cart);

}
