package com.app.nitin.service;

import java.util.List;

import com.app.nitin.entity.OrderLineItemsList;

public interface IOrderService {

	public void saveOrderDetails(List<OrderLineItemsList> itemsList);
}
