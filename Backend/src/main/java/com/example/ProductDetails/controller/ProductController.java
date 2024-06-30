package com.example.ProductDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ProductDetails.entity.Product;
import com.example.ProductDetails.service.ProductService;

@RestController
@RequestMapping("/products")
@CrossOrigin(origins = "http://localhost:3002")
public class ProductController {
     @Autowired
     private ProductService productService;
     
     @GetMapping
     public List<Product> getAllProducts() {
         return productService.getAllProducts();
     }

     @PostMapping
     public Product addProduct(@RequestBody Product product) {
         return productService.addProduct(product);
     }

     @PutMapping("/{id}")
     public ResponseEntity<Product> updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
         Product updatedProduct = productService.updateProduct(id, productDetails);
         return ResponseEntity.ok(updatedProduct);
     }

     @DeleteMapping("/{id}")
     public ResponseEntity<Void> deleteProduct(@PathVariable Long id) {
         productService.deleteProduct(id);
         return ResponseEntity.noContent().build();
     }
}
