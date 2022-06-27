package com.demo.rest;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;


import com.demo.rest.entity.Product;

public class TestObjectFactory {
	public static Product createProduct() {
		  final Product product = new Product();
		  product.setId(new Random().nextInt());
		  product.setNama(RandomStringUtils.randomAlphabetic(10));
		  product.setHargaBeli(new Random().nextInt());
		  product.setHargaJual(new Random().nextInt());

		  return product;
		}

		public static List<Product> createProductList(final int size){
		  final List<Product> result = new ArrayList<>();
		  for(int i=0; i<size; i++) {
		    result.add(createProduct());
		  }
		  return result;
		}
}
