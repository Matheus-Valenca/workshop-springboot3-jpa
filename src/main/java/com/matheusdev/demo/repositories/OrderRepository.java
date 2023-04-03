package com.matheusdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
