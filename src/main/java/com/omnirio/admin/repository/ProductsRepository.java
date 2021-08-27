package com.omnirio.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omnirio.admin.entity.Products;

public interface ProductsRepository extends JpaRepository<Products, Long> {

}
