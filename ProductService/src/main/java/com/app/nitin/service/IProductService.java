package com.app.nitin.service;

import java.util.List;

import com.app.nitin.entity.Product;

public interface IProductService {

	public void saveProduct(Product product);
	public List<Product> findAllProduct();
}
