package com.demo.rest.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.demo.rest.entity.Product;
import com.demo.rest.service.ProductService;

@RestController
@RequestMapping("/api/v1")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@CrossOrigin
	@GetMapping("/products")
	public List<Product> list() {
		return productService.findAllProduct();
	}
	
	@CrossOrigin
	@GetMapping("products/{id}")
	public ResponseEntity<Product> get(@PathVariable Integer id) {
		try {
			Product product = productService.findProductById(id);
			return new ResponseEntity<Product>(product, HttpStatus.OK);
		}catch (NoSuchElementException e) {
			return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@PostMapping("/products")
	public void products (@RequestBody Product product) {
		productService.saveorUpdateProduct(product);
	}
	
	@CrossOrigin
	@PutMapping("/products/{id}")
	public ResponseEntity<?> update(@RequestBody Product product, @PathVariable Integer id) {
		try {
			Product existProduct = productService.findProductById(id);
			if (existProduct.getId() != id) {
				return new ResponseEntity<>("ID Produk tidak ditemukan",HttpStatus.OK);
			}
			product.setId(id);
			productService.saveorUpdateProduct(product);
			return new ResponseEntity<>("Data berhasil diubah", HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@CrossOrigin
	@DeleteMapping("/products/{id}")
	public ResponseEntity<?> delete(@PathVariable Integer id) {
		productService.deleteProduct(id);
		return new ResponseEntity<>("Data berhasil dihapus",HttpStatus.OK);
	}
}