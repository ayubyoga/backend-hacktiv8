package com.demo.rest.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_product")
public class Product {
	private int id;
	private String nama;
	private int hargaBeli;
	private int hargaJual;
	
	public Product() {
		
	}
	
	public Product(int id, String nama, int hargaBeli, int hargaJual) {
		this.id = id;
		this.nama = nama;
		this.hargaBeli = hargaBeli;
		this.hargaJual = hargaJual;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
	
	public void setHargaBeli(int hargaBeli) {
		this.hargaBeli = hargaBeli;
	}
	
	public int getHargaBeli() {
		return hargaBeli;
	}
	public void setHargaJual(int hargaJual) {
		this.hargaJual = hargaJual;
	}
	
	public int getHargaJual() {
		return hargaJual;
	}
}