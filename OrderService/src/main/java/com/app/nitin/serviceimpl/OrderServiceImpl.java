package com.app.nitin.serviceimpl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.nitin.entity.Order;
import com.app.nitin.entity.OrderLineItemsList;
import com.app.nitin.repo.OrderLineItemsListRepo;
import com.app.nitin.repo.OrderRepo;
import com.app.nitin.service.IOrderService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private OrderLineItemsListRepo listRepo;

	@Autowired
	private OrderRepo orderRepo;

	public void saveOrderDetails(List<OrderLineItemsList> itemsList) {
		
		
		log.info("Order Details Saved Successfully");

		Order order = new Order();
		order.setOrderNo(UUID.randomUUID().toString());
		order.setOrderLineItemsList(itemsList);
		
		// call InventoryService and place order if product is in stock
		
		
		orderRepo.save(order);

		log.info("Order of Number:- {} savecSuccessfully",order.getOrderNo());
	}

}
