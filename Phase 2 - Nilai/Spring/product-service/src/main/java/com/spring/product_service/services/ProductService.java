package com.spring.product_service.services;

import java.util.List;

import com.spring.product_service.shared.ProductDto;

public interface ProductService {
	
	public ProductDto createProduct(ProductDto productDetails);
	
	public List<ProductDto> displayProducts();

}
