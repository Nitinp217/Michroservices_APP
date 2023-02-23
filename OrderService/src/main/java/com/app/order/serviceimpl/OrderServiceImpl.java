package com.app.order.serviceimpl;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.reactive.function.client.WebClient;

import com.app.order.dto.InventoryResponse;
import com.app.order.entity.Order;
import com.app.order.entity.OrderLineItemsList;
import com.app.order.repo.OrderRepo;
import com.app.order.service.IOrderService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
@Transactional
public class OrderServiceImpl implements IOrderService {

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private WebClient.Builder webClientBuilder;

	public void saveOrderDetails(List<OrderLineItemsList> itemsList) {

		log.info("Order Details Saved Successfully");

		System.out.println("items : "+itemsList);
		Order order = new Order();
		order.setOrderNo(UUID.randomUUID().toString());
		order.setOrderLineItemsList(itemsList);

		List<String> skuCode = order.getOrderLineItemsList().stream().map(OrderLineItemsList::getSkuCode).toList();
		
		// call InventoryService and place order if product is in stock
		InventoryResponse[] inventoryResponseArray = webClientBuilder.build().get()
				.uri("http://Inventory-Service/api/inventory",
						uribuilder -> uribuilder.queryParam("skuCode", skuCode).build())
				.retrieve().bodyToMono(InventoryResponse[].class).block();
		
		
		boolean allProductsIsInStock = Arrays.stream(inventoryResponseArray)
				.allMatch(i -> i.getIsInStock());
		
		if (allProductsIsInStock)
			orderRepo.save(order);
		else
			throw new IllegalArgumentException("Product not in stock ! Please try again later");

		log.info("Order of Number:- {} saved Successfully", order.getOrderNo());
	}

}
