package com.app.nitin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nitin.entity.OrderLineItemsList;

@Repository
public interface OrderLineItemsListRepo extends JpaRepository<OrderLineItemsList, Integer> {

}
