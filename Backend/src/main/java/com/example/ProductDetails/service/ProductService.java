package com.example.ProductDetails.service;

import java.util.List;

import com.example.ProductDetails.entity.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product addProduct(Product product);

	Product updateProduct(Long id, Product productDetails);

	void deleteProduct(Long id);
     
}
