package com.app.order.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.order.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
