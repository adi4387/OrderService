package com.pubkart.order.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

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
	@ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;
	public LineItem() {}
	
}
