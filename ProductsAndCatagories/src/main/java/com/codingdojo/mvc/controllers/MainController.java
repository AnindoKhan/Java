package com.codingdojo.mvc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.mvc.models.Category;
import com.codingdojo.mvc.models.Product;
import com.codingdojo.mvc.services.CategoryService;
import com.codingdojo.mvc.services.ProductService;

@Controller
public class MainController {
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("products", productService.findAllProducts());
		model.addAttribute("categories", categoryService.findAllCategorys());
		return "index.jsp";
	}
	@GetMapping("/products/new")
	public String createProduct(@ModelAttribute("product") Product product){
		return "newProduct.jsp";
	}
	@PostMapping("/products/new")
	public String newProduct(@Valid @ModelAttribute("product") Product product, BindingResult result) {
		if(result.hasErrors()) {
			return "newProduct.jsp";
		}else {
			productService.createProduct(product);
			return "redirect:/";
		}
	}
	@GetMapping("/categories/new")
	public String createCategory(@ModelAttribute("cat") Category category) {
		return "newCategory.jsp";
	}
	@PostMapping("/categories/new")
	public String newCategory(@Valid @ModelAttribute("cat") Category category, BindingResult result) {
		if(result.hasErrors()) {
			return "newCategory.jsp";
		}else {
			categoryService.createCategory(category);
			return "redirect:/";
		}
	}
	@GetMapping("/products/{id}")
	public String productInfo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("product",productService.findById(id));
		model.addAttribute("categories",categoryService.findAllCategorys());
		return "productInfo.jsp";
	}
	@GetMapping("/categories/{id}")
	public String categoryInfo(@PathVariable("id") Long id, Model model) {
		model.addAttribute("category", categoryService.findById(id));
		model.addAttribute("products", productService.findAllProducts());
		return "categoryInfo.jsp";
	}
	@PostMapping("/products/{id}")
	public String addCategoryToProduct(@RequestParam("category") Category category, @PathVariable("id") Long productId) {
		System.out.println(category);
		productService.addCategory(productId, category);
		return "redirect:/products/" + productId;
	}
}