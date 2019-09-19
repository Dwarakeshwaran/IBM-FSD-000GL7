package com.spring.feign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.feign.entity.Product;
import com.spring.feign.product.ProductClient;

@Controller
@RequestMapping("/")
public class FiegnController {
	
	@Autowired
	private ProductClient client;
	
	@GetMapping("/showForm")
	public String showForm(Model theModel) {
		
		Product product = new Product();
		theModel.addAttribute("product",product);
		
		return "products";
	}
	
	@PostMapping("/createProduct")
	public ResponseEntity<?> createProduct(@RequestBody Product product){
		
		return ResponseEntity.ok(client.createProduct(product));
		
	}
	
	
	@GetMapping("/fetchProducts")
	public ResponseEntity<?> fetchProducts(){
		return ResponseEntity.ok(client.getAllProducts());
	}

}
