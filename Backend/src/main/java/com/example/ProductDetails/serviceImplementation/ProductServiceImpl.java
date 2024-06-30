package com.example.ProductDetails.serviceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ProductDetails.entity.Product;
import com.example.ProductDetails.repository.ProductRepository;
import com.example.ProductDetails.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService{
         @Autowired
         private ProductRepository productRepository;
         
         public List<Product> getAllProducts() {
             return productRepository.findAll();
         }

         public Product addProduct(Product product) {
             return productRepository.save(product);
         }

         public Product updateProduct(Long id, Product productDetails) {
             Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
             product.setname(productDetails.getname());
             product.setPrice(productDetails.getPrice());
             product.setCategory(productDetails.getCategory());
             return productRepository.save(product);
         }

         public void deleteProduct(Long id) {
             Product product = productRepository.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
             productRepository.delete(product);
         }
}
