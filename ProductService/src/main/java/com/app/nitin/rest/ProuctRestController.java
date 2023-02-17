package com.app.nitin.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.nitin.entity.Product;
import com.app.nitin.service.impl.ProductServiceImpl;



@RestController
@RequestMapping("/v1/api/product")
public class ProuctRestController {

	@Autowired
	private ProductServiceImpl service;
	
	@PostMapping("/create")
	public ResponseEntity<String> createProduct(@RequestBody Product product){
		service.saveProduct(product);
		return new ResponseEntity<>("Product created successfully",HttpStatus.CREATED);
	}
	
	@GetMapping("/fetchAll")
	public ResponseEntity<List<Product>> fetchAllProducts(){
		List<Product> list = service.findAllProduct();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
}
