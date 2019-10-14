package com.pubkart.order.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pubkart.order.model.Order;

@FeignClient(name = "catalog",fallback = OrderServiceFallback.class)
public interface OrderService {

	@GetMapping("/departments")
	public List<Order> getCatalog();
	
}
