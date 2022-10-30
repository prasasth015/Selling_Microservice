package com.selling.productservice.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.selling.productservice.dto.ProductRequest;
import com.selling.productservice.dto.ProductResponse;
import com.selling.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(path ="/api/product")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService;

	@PostMapping("/create")
	@ResponseStatus(HttpStatus.CREATED)
	//ProductRequest acts as DTO
	public  void createProduct(@RequestBody ProductRequest productRequest) {
		productService.createProduct(productRequest);
		
		
	}
	
	@GetMapping("/get")
	@ResponseStatus(HttpStatus.OK)
	public List<ProductResponse> getAllProducts(){
		return productService.getAllProducts();
	}
}
