package com.services;

import java.util.Optional;

import com.client.FindByPageRequest;
import com.client.FindByPageResponse;
import com.entities.Category;

public interface CategoryService {
	public FindByPageResponse<Category> findByPage(FindByPageRequest findByPageRequest);

	Category saveCate(Category cate);

	Category updateCate(Category cateUpdate);

	void deleteCate(Long id);

	Optional<Category> findCateById(Long id);

}
