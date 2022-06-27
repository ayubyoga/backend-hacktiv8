package com.demo.rest.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.rest.entity.Product;

@Service
	public interface ProductService {

		List<Product> findAllProduct();

		Product findProductById(int id);

		Product saveorUpdateProduct(Product product);

		void deleteProduct(int id);
	}