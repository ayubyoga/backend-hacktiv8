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
	private ProductRepository productsRepository;

	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productsRepository.findAll();
	}

	@Override
	public List<Product> findAllProductsByName(String name) {
		// TODO Auto-generated method stub
		return productsRepository.findAllByName(name);
	}

	@Override
	public Product findProductById(Long id) {
		// TODO Auto-generated method stub
		return productsRepository.findProductsById(id);
	}

	@Override
	public Product saveProduct(Product product) {
		// TODO Auto-generated method stub
		return productsRepository.save(product);
	}

	@Override
	public void deleteProductById(Long id) {
		// TODO Auto-generated method stub
		productsRepository.deleteById(id);

	}

}
