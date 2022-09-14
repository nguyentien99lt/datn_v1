package com.services;

import java.util.List;
import java.util.Optional;

import com.entities.Category;

public interface CategoryService {
	List<Category> getAlCategories();
	
	void saveCate(Category cate);
	
	void deleteCate(Long id);
	
	Optional<Category> findCateById(Long id);
	
}
