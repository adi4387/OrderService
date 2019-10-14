package com.pubkart.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pubkart.order.model.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
