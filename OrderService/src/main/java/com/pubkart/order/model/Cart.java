package com.pubkart.order.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long cartId;
	private String UserId;
	
	@OneToOne
	@JoinColumn(name="orderId")
	private Order order;
	
	@OneToMany
	private List<LineItem> items;
	private Double cartValue;
	
	public Cart() {
		
	}

	
	
}
