package com.website.furniture_ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.website.furniture_ecommerce.entity.Product;
import com.website.furniture_ecommerce.entity.User;
import com.website.furniture_ecommerce.exception.OurRuntimeException;
import com.website.furniture_ecommerce.repository.ProductRepository;
import com.website.furniture_ecommerce.repository.UserRepository;
import com.website.furniture_ecommerce.requestDto.ProductRequestDto;
import com.website.furniture_ecommerce.response.ProductListResponse;
import com.website.furniture_ecommerce.response.ProductResponseDto;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private UserRepository userRepository;

	public void create(ProductRequestDto d) {

		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		Product product = new Product();
		product.setId(null);
		product.setName(d.getName());
		product.setPrice(d.getPrice());
		product.setImage(d.getImage());
		product.setUserId(id);
		productRepository.save(product);
	}

	public ProductListResponse getAll() {
		String username = SecurityContextHolder.getContext().getAuthentication().getName();
		User user = userRepository.getUserByUsername(username);
		Integer id = user.getId();
		
		List<Product> products = productRepository.findAllByUserId(id);
		ProductListResponse response = new ProductListResponse();
		response.setProducts(products);
		return response;
	}

	public ProductResponseDto get(Integer id) {
		if (id == null || id<=0) {
			throw new OurRuntimeException(null, "id is required");
		}
		Optional<Product> byId = productRepository.findById(id);
		ProductResponseDto response = new ProductResponseDto();
		if (byId.isPresent()) {
			Product product = byId.get();
			response.setId(product.getId());
			response.setName(product.getName());
			response.setPrice(product.getPrice());
			response.setImage(product.getImage());
		}else {
			throw new OurRuntimeException(null, "id cannot be found");
		}
		return response;
	}

	public void update(ProductRequestDto dto) {
		if (dto.getId() == null || dto.getId() <= 0) {
			throw new OurRuntimeException(null, "id is required");
		}
		Optional<Product> byId = productRepository.findById(dto.getId());
		if (byId.isPresent()) {
			Product product = byId.get();
			product.setId(dto.getId());
			product.setName(dto.getName());
			product.setPrice(dto.getPrice());
			product.setImage(dto.getImage());
			productRepository.save(product);
		}else {
			throw new OurRuntimeException(null, "id cannot be found");
		}
		
	}

	public void delete(Integer id) {
		if (id == null || id <= 0) {
			throw new OurRuntimeException(null, "id is required");
		}
		if (productRepository.findById(id).isPresent()) {
			productRepository.deleteById(id);
		}else {
			throw new OurRuntimeException(null, "id cannot be found");
		}
	}
}
