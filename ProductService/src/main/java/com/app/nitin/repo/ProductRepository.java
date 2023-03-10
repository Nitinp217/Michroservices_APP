package com.app.nitin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nitin.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
