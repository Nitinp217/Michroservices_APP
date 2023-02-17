package com.app.nitin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nitin.entity.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

}
