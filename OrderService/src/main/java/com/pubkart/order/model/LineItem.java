package com.pubkart.order.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@ToString
public class LineItem {

	
	private int id;
	private int quantity;
	private double perUnitPrice;
	
	public LineItem() {}
	
}
