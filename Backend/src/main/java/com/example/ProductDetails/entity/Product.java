package com.example.ProductDetails.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ProductDetails")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   private String name;
   private double price;
   private String category;
public long getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getname() {
	return name;
}
public void setname(String name) {
	this.name = name;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
}
