package com.matheusdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.demo.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
