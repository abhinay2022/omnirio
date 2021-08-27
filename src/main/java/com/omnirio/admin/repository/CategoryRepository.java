package com.omnirio.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.omnirio.admin.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
