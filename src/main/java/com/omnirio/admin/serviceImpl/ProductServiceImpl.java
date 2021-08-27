package com.omnirio.admin.serviceImpl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.omnirio.admin.entity.Products;
import com.omnirio.admin.exception.ResourceNotFoundException;
import com.omnirio.admin.repository.ProductsRepository;
import com.omnirio.admin.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired private ProductsRepository productRepository;
	
	@Override
	public ResponseEntity<Products> addProduct(Products products) {
		products=productRepository.save(products);
		return new ResponseEntity<Products>(products, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Products> viewProduct(Long id) {
		Optional<Products> product=productRepository.findById(id);
		if(product.isPresent()) {
			return new ResponseEntity<Products>(product.get(), HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Product Not Found");
		}
	}

	@Override
	public ResponseEntity<List<Products>> allProducts() {
		List<Products> product=productRepository.findAll();
		if(!product.isEmpty()) {
			return new ResponseEntity<List<Products>>(product, HttpStatus.OK);
		}else {
			throw new ResourceNotFoundException("Product Not Found");
		}
	}

}
