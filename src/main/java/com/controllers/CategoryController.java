package com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.client.FindByPageRequest;
import com.client.FindByPageResponse;
import com.entities.Category;
import com.services.CategoryService;


@RestController
@CrossOrigin
public class CategoryController {
	@Autowired
	private CategoryService cateService;

	@PostMapping("/findbypage")
	public FindByPageResponse<Category> findByPage(@RequestBody FindByPageRequest request) {
		return cateService.findByPage(request);
	}

	@PostMapping("/create")
	public Category addCate(@RequestBody Category cate) {
		return cateService.saveCate(cate);
	}

	@PostMapping("/edit")
	public Category editCate(@RequestBody Category category) {
		return cateService.updateCate(category);
	}

	@DeleteMapping("/delete")
	public Boolean deleteCate(@RequestParam Long id) {
		return cateService.deleteCate(id);
	}

}
