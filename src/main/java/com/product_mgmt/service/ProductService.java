package com.product_mgmt.service;

import java.util.List;

import com.product_mgmt.entity.Product;

public interface ProductService {

	String addProduct(Product prod);
	String updateProduct(Product prod);
	String deleteProduct(Long prodId);
	Product viewProduct(Long prodId);
	List<Product> viewAllProducts();

	
}
