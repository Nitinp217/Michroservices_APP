package com.app.nitin.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.nitin.entity.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory,Integer> {

	Optional<Inventory> findBySkuCode(String skuCode);

}
