package com.pubkart.order.feign;

import org.springframework.stereotype.Component;

import com.pubkart.order.model.Payment;
import com.pubkart.order.model.PaymentResponse;

@Component
public class PaymentFeignServiceFallBack implements PaymentFeignService {

	@Override
	public PaymentResponse makePayment(Payment payment ) {
		
		
		return null;
	}

}
