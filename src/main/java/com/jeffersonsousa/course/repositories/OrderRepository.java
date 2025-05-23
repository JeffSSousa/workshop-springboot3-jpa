package com.jeffersonsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffersonsousa.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{

}
