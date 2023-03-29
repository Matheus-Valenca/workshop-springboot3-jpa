package com.matheusdev.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusdev.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
