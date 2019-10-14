package com.pubkart.order.model;

import lombok.Data;

@Data
public class PaymentResponse {
	private PaymentStatus status;
	private String transactionId;
	
	public PaymentResponse() {
		
	} 
}
