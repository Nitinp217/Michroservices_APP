package com.app.nitin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "inventory_tab")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Inventory {

	@Id
	private Integer id;
	private String skuCode;
	private Integer quantity;
}
