package com.app.product.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.product.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
