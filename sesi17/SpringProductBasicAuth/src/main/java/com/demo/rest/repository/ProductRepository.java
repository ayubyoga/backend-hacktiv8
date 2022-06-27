package com.demo.rest.repository;

import com.demo.rest.entity.*;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	List<Product> findAll();

	Product save(Product product);

}