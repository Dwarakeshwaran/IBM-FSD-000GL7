package com.spring.product_service.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.product_service.model.RequestModel;
import com.spring.product_service.model.ResponseModel;
import com.spring.product_service.services.ProductService;
import com.spring.product_service.shared.ProductDto;

@RestController("/")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping("/product")
	public ResponseEntity<ResponseModel> createProduct(@RequestBody RequestModel productDetail){
		ModelMapper mapper =  new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		
		ProductDto pDto = mapper.map(productDetail, ProductDto.class);
		
		ProductDto tempDto = productService.createProduct(pDto);
		
		
		ResponseModel model = mapper.map(tempDto, ResponseModel.class);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(model);
		
	}
	
	@GetMapping("/product/get")
	public ResponseEntity<?> show(){
		return ResponseEntity.ok(productService.displayProducts());
		
	}
	
	@RequestMapping("/product/form")
	public ProductDto showProductForm(Model model){
		ProductDto product = new ProductDto();

		return product;
		
	}

}
