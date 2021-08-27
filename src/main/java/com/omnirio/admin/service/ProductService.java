package com.omnirio.admin.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.omnirio.admin.entity.Products;

public interface ProductService {

	ResponseEntity<Products> addProduct(Products products);

	ResponseEntity<Products> viewProduct(Long id);

	ResponseEntity<List<Products>> allProducts();

}
