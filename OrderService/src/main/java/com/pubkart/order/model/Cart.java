package com.pubkart.order.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
@Entity
public class Cart {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String UserId;
	@OneToOne(mappedBy = "cart")
	private Order order;

	@OneToMany(mappedBy = "cart", cascade = CascadeType.ALL)
	private Set<LineItem> items;
	private Double cartValue;

	public Cart() {

	}

}
