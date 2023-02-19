package com.app.nitin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.nitin.repository.InventoryRepository;
import com.app.nitin.service.IInventoryService;

@Service
public class InventoryServiceImpl implements IInventoryService{

	@Autowired
	private InventoryRepository repo;
	
	@Transactional(readOnly = true)
	public boolean isInStock(String skuCode) {
		return repo.findBySkuCode(skuCode).isPresent();
	}

	
}
