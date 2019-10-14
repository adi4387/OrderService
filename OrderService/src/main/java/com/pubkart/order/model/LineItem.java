package com.pubkart.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
@Entity
public class LineItem {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Integer quantity;
	private Double perUnitPrice;
	
	public LineItem() {}
	
}
