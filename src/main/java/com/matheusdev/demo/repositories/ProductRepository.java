package com.matheusdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
