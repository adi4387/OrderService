package com.pubkart.order.model;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

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
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long orderId;
	@OneToOne(mappedBy = "order")
    private Cart cart;
	private String paymentId;
	private PaymentStatus paymentStatus;
	private OrderStatus orderStatus;
	private String userId;
	private Date orderDate;
	
	public Order() {
		
		
	}

	
	
}
