package com.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entities.Category;
import com.repositories.CategoryRepository;
import com.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository cateRep;
	 @Override
		public void saveCate(Category cate) {
		cateRep.save(cate);
	}
	 @Override
	public void deleteCate(Long id) {
		cateRep.deleteById(id);
	}
	 @Override
	public Optional<Category> findCateById(Long id){
		return cateRep.findById(id);
	}
	@Override
	public List<Category> getAlCategories() {
		return (List<Category>) cateRep.findAll();
	}

}
