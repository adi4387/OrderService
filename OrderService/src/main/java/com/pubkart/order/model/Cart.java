package com.pubkart.order.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Entity
public class Cart {
	
	@Id
	private Long id;
	private String UserId;
	private List<LineItem> items;
	private double cartValue;
	
	public Cart() {
		
	}

	
	
}
