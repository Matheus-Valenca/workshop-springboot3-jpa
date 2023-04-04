package com.matheusdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
