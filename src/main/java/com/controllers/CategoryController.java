package com.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.entities.Category;
import com.services.CategoryService;

@Controller
public class CategoryController {
	@Autowired
	private CategoryService cateService;

	@RequestMapping("/categorys/index")
	public String index(Model model) {
		List<Category> cates = cateService.getAlCategories();
		model.addAttribute("cates", cates);
		return "admin/category/index";
	}

	@RequestMapping(value = "/categorys/add")
	public String addCate(Model model) {
		model.addAttribute("category", new Category());
		return "admin/category/addCate";
	}

	@RequestMapping(value = "/categorys/edit", method = RequestMethod.GET)
	public String editCate(@RequestParam("id") Long cateId, Model model) {
		Optional<Category> cateEdit = cateService.findCateById(cateId);
		cateEdit.ifPresent(cate -> model.addAttribute("cate", cate));
		return "admin/category/editCate";
	}

	@RequestMapping(value = "/categorys/save", method = RequestMethod.POST)
	public String save(Category cate) {
		cateService.saveCate(cate);
		return "redirect:/categorys/index";
	}

	@RequestMapping(value = "/categorys/delete", method = RequestMethod.GET)
	public String deleteCate(@RequestParam("id") Long cateId, Model model) {
		cateService.deleteCate(cateId);
		return "redirect:/categorys/index";
	}
}
