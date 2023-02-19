package com.app.inventory.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.inventory.dto.InventoryResponse;
import com.app.inventory.repository.InventoryRepository;
import com.app.inventory.service.IInventoryService;

@Service
public class InventoryServiceImpl implements IInventoryService{

	@Autowired
	private InventoryRepository repo;
	
	@Transactional(readOnly = true)
	public List<InventoryResponse> isInStock(List<String> skuCode) {
		return repo.findBySkuCodeIn(skuCode).stream()
				.map(inventory->InventoryResponse.builder()
						.skuCode(inventory.getSkuCode())
						.isInStock(inventory.getQuantity() > 0).build()
						).toList();
	}

	
}
