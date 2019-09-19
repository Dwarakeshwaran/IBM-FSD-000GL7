package com.spring.product_service.services;



import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.spring.product_service.entity.Product;
import com.spring.product_service.repository.ProductRepository;
import com.spring.product_service.shared.ProductDto;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private Environment env;
	ProductRepository productRepo;

	@Autowired
	public ProductServiceImpl(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public ProductDto createProduct(ProductDto productDetails) {
		
		
		ModelMapper mapper = new ModelMapper();
		mapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		
		Product product = mapper.map(productDetails, Product.class);
		
		productRepo.save(product);
		
		ProductDto pDto = mapper.map(product, ProductDto.class);
		
		return pDto;
	}
	
	@Override
	public List<ProductDto> displayProducts(){
		List products = new ArrayList<ProductDto>();
		for(Product p : productRepo.findAll()) {
			products.add(p);
		};
		
		
		return products;
		
	}

}
