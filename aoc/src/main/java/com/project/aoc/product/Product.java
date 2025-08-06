package com.project.aoc.product;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long product_id;

	@Column()
	private String product_name;

	@Column()
	private String product_code;

	@Column()
	private int product_price;

	@Column(name = "CREATED_AT")
	private LocalDateTime createdAt;

	@Column(name = "UPDATED_AT")
	private LocalDateTime updatedAt;
	
	@Column(name = " PRODUCT_INGREDIENTS")
	private String ingredients;

	@Column(name = " PRODUCT_USE")
	private String use;

	@Column(name = "PRODUCT_SHELF_LIFE")
	private String shelfLife;

	@Column(name = "PRODUCT_VOLUME")
	private String volume;

	@Column(name = "PRODUCT_ORIGIN_COUNTRY")
	private String originCountry;


	}

