package com.pubkart.order.service.impl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.pubkart.order.feign.InventoryFeignService;
import com.pubkart.order.feign.PaymentFeignService;
import com.pubkart.order.model.Cart;
import com.pubkart.order.model.LineItem;
import com.pubkart.order.model.Order;
import com.pubkart.order.model.OrderStatus;
import com.pubkart.order.model.Payment;
import com.pubkart.order.model.PaymentResponse;
import com.pubkart.order.model.PaymentStatus;
import com.pubkart.order.repository.OrderRepository;
import com.pubkart.order.service.OrderService;

public class OrderServiceImpl implements OrderService {

	private static final String PASS = "PASS";
	@Autowired
	InventoryFeignService inventoryFeignService;

	@Autowired
	PaymentFeignService paymentFeignService;

	@Autowired
	OrderRepository orderRepository;

	@Override
	public String createOrder(Cart cart) {
		List<LineItem> items = new ArrayList<LineItem>(cart.getItems());
		ResponseEntity<String> result = inventoryFeignService.getItems(items);

		if (result.equals(PASS)) {
			Order order = saveInitialOrder(cart);
			makePayment(cart, order);
			return "Order Created Successfully";
		} else {
			return result.getBody();
		}

	}

	private void makePayment(Cart cart, Order order) {
		Payment payment = new Payment(order.getUserId(), order.getId(), cart.getCartValue(), null);
		PaymentResponse response = paymentFeignService.makePayment(payment);
		if (PaymentStatus.SUCCESS.equals(response.getStatus())) {
			updateOrderWhenPaymentIsSuccessFull(order, response);
		} else {
			updateOrderWhenPaymentFails(order, response);
		}
	}

	private void updateOrderWhenPaymentFails(Order order, PaymentResponse response) {
		order.setPaymentStatus(PaymentStatus.FAILURE);
		order.setOrderStatus(OrderStatus.FAILURE);
		order.setPaymentId(response.getTransactionId());
		orderRepository.save(order);
	}

	private void updateOrderWhenPaymentIsSuccessFull(Order order, PaymentResponse response) {
		order.setPaymentStatus(PaymentStatus.SUCCESS);
		order.setOrderStatus(OrderStatus.SUCCESS);
		order.setPaymentId(response.getTransactionId());
		orderRepository.save(order);
	}

	private Order saveInitialOrder(Cart cart) {
		Order order = new Order();
		order.setCart(cart);
		order.setOrderDate(new Date(new java.util.Date().getTime()));
		order.setUserId(cart.getUserId());
		order = orderRepository.save(order);
		return order;
	}

}
