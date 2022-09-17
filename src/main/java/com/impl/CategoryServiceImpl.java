package com.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.client.FindByPageRequest;
import com.client.FindByPageResponse;
import com.entities.Category;
import com.repositories.CategoryRepository;
import com.services.CategoryService;


@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository cateRep;

	@Override
	public Category saveCate(Category cate) {
		cateRep.save(cate);
		return cate;
	}

	@Override
	public Category updateCate(Category cateUpdate) {
		Category cate = cateRep.findById(cateUpdate.getId()).get();
		if (cate != null) {
			cate.setName(cateUpdate.getName());
			return cateRep.save(cate);
		} else {
			return null;
		}

	}

	@Override
	public void deleteCate(Long cateDelete) {
		cateRep.deleteById(cateDelete);
	}

	@Override
	public Optional<Category> findCateById(Long id) {
		return cateRep.findById(id);
	}

	@Override
	public FindByPageResponse<Category> findByPage(FindByPageRequest findByPageRequest) {
		try {
			Integer pageNumber = findByPageRequest.getPageNumber();
			Integer pageSize = findByPageRequest.getPageSize();
			Pageable page = PageRequest.of(pageNumber, pageSize);
			Page<Category> pageCategory = cateRep.findAll(page);
			List<Category> listCate = pageCategory.getContent();
			FindByPageResponse<Category> reponse = new FindByPageResponse<Category>();

			reponse.setPageResponse(listCate);
			reponse.setPageSize(pageCategory.getSize());
			reponse.setCurentPage(pageCategory.getNumber());
			reponse.setTotalPage(pageCategory.getTotalPages());
			reponse.setTotalElm(pageCategory.getTotalElements());
			return reponse;
		} catch (Exception e) {
			return null;
		}
	}

}
