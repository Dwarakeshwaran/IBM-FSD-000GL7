package com.spring.feign.product;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.feign.entity.Product;

@FeignClient(name = "product-ws")
public interface ProductClient {
	
	@RequestMapping(value = "/product", method=RequestMethod.GET)
	public ResponseEntity<?> createProduct(Product product);
	
	
	@RequestMapping(value = "/product/get", method= RequestMethod.GET)
	public ResponseEntity<?> getAllProducts();
	

}
