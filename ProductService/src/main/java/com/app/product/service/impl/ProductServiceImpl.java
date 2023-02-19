package com.app.product.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.product.entity.Product;
import com.app.product.repo.ProductRepository;
import com.app.product.service.IProductService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ProductServiceImpl implements IProductService {

	@Autowired
	private ProductRepository repo;
	
	public void saveProduct(Product product) {
		repo.save(product);
		log.info("Product of ID : {} saved",product.getId());
	}

	public List<Product> findAllProduct() {
		List<Product> list = repo.findAll();
		log.info("All records fetch successfully");
		return list;
	}

}
