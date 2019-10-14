package com.pubkart.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.pubkart.order.model.Payment;
import com.pubkart.order.model.PaymentResponse;

@FeignClient(name = "payment-service", fallback = PaymentFeignServiceFallBack.class)
public interface PaymentFeignService {

	@GetMapping("/makePayment")
	public PaymentResponse makePayment(Payment payment );

}
