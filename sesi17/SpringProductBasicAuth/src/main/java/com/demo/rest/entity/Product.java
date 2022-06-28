package com.demo.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "tb_product")
@Data
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "nama", unique = true)
	private String name;

	@Column(name = "hargaBeli")
	private int hargaBeli;

	@Column(name = "hargaJual")
	private int hargaJual;

	public void setId(Long id2) {
		// TODO Auto-generated method stub
		
	}
}
