package com.pubkart.order.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class Cart {
	
	private String UserId;
	private List<LineItem> items;
	private double cartValue;
	
	public Cart() {}

	
	
}
