package com.pubkart.order.feign;

import java.util.List;

import org.springframework.stereotype.Component;

import com.pubkart.order.model.Order;

@Component
public class OrderServiceFallback implements OrderService {

	@Override
	public List<Order> getCatalog() {
		return null;
	}

}
