package com.app.product.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="prod_tab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	@Id 
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String details;
	private Double cost; 
}
