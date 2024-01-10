package com.seed.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.seed.binding.Product;

@RestController
public class controller {
	
	
	@GetMapping("/")

	public String getProductForm(Model model) {
		
		Product proobj=new Product();
		model.addAttribute("product", proobj);
		
		return "index";
		
	}

	@GetMapping("/product")
	public String handelfromsubmit(Product product, Model model) {
		
		System.out.println(product);
		model.addAttribute("msg", "product save sucessfully");
		
		return "sucess";
	}
}
