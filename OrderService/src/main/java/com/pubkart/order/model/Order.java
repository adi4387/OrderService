package com.pubkart.order.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
@Entity
public class Order {
	
	@Id
	private Long orderId;
    private Cart cart;
	private String paymentId;
	private PaymentStatus paymentStatus;
	private OrderStatus orderStatus;
	private String userId;
	private LocalDateTime orderDate;
	
	public Order() {
		
		
	}

	
	
}
