package com.app.product.service;

import java.util.List;

import com.app.product.entity.Product;

public interface IProductService {

	public void saveProduct(Product product);
	public List<Product> findAllProduct();
}
