package com.omnirio.admin.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.omnirio.admin.entity.Category;

public interface CategoryService {

	ResponseEntity<Category> addCategory(Category category);

	ResponseEntity<Category> viewCategory(Long id);

	ResponseEntity<List<Category>> allCategory();

}
