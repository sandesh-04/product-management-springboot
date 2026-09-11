package com.product_mgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product_mgmt.entity.Product;

public interface ProductRepository
			extends JpaRepository<Product, Long>{

}
