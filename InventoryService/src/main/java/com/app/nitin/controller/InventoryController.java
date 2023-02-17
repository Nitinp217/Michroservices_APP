package com.app.nitin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.nitin.service.impl.InventoryServiceImpl;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

	@Autowired
	private InventoryServiceImpl service;

	@GetMapping("/sku-code")
	public ResponseEntity<Boolean> isInStock(
			@PathVariable("sku-code") String skuCode) {
		return ResponseEntity.ok(service.isInStock(skuCode));
	}
}
