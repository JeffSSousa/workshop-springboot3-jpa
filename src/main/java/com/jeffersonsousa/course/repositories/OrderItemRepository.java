package com.jeffersonsousa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jeffersonsousa.course.entities.OrderItem;
import com.jeffersonsousa.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
