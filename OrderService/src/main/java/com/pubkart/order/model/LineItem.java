package com.pubkart.order.model;

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
public class LineItem {

	@Id
	private int id;
	private int quantity;
	private double perUnitPrice;
	
	public LineItem() {}
	
}
