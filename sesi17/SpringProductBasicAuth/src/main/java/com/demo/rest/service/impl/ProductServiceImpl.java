package com.demo.rest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.rest.entity.Product;
import com.demo.rest.repository.ProductRepository;
import com.demo.rest.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product saveorUpdateProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product findProductById(int id) {
		Product product = productRepository.findById(id).orElse(new Product());
		return product;
	}

	@Override
	public void deleteProduct(int id) {
		Product product = productRepository.findById(id).orElse(new Product());
		productRepository.delete(product);

	}

}