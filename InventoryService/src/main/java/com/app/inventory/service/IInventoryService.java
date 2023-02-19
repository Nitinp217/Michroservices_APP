package com.app.inventory.service;

import java.util.List;

import com.app.inventory.dto.InventoryResponse;

public interface IInventoryService {

	List<InventoryResponse> isInStock(List<String> skuCode);
}
