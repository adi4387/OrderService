package com.pubkart.order.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Order {
	
	
	private Long orderId;
    private Cart cart;
	private Long paymenttId;
	private PaymentStatus paymentStatus;
	private OrderStatus orderStatus;
	private Long userId;
	private Date orderDate;
	
	public Order() {
		
		
	}

	
	
}
