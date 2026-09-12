package com.product_mgmt.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.product_mgmt.entity.Product;
import com.product_mgmt.repository.ProductRepository;

@Service
public class ProductServiceImplementation 
					implements ProductService{

	ProductRepository repo;
	
	public ProductServiceImplementation(ProductRepository repo) {
		super();
		this.repo = repo;          //create object on its own
	} 

	@Override
	public String addProduct(Product prod) {
		repo.save(prod);    //to save our object
		return "Product added successfully";
	}
	
	@Override
	public String updateProduct(Product prod) {
		repo.save(prod);
		return "Product updated successfully";
		}
	
	@Override
	public String deleteProduct(Long prodId) {
		repo.deleteById(prodId);
		return "Product deleted successfully";
	}
	
	@Override
	public Product viewProduct(Long prodId) {
		return repo.findById(prodId).get();
	}
	
	@Override
	public List<Product> viewAllProducts() {
		return repo.findAll();
	}
	

}
