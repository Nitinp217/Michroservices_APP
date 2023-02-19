package com.app.order.service;

import java.util.List;

import com.app.order.entity.OrderLineItemsList;

public interface IOrderService {

	public void saveOrderDetails(List<OrderLineItemsList> itemsList) throws IllegalAccessException;
}
