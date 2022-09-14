package datn.store.service;

import java.util.List;
import java.util.Optional;

import datn.store.entity.Category;

public interface CategoryService {
	List<Category> getAlCategories();
	
	void saveCate(Category cate);
	
	void deleteCate(Long id);
	
	Optional<Category> findCateById(Long id);
	
}
