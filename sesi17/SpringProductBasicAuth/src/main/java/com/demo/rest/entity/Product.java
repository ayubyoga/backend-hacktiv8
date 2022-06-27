package com.demo.rest.entity;

import com.demo.rest.entity;
import com.demo.rest.GeneratedValue;
import com.demo.rest.GenerationType;
import com.demo.rest.Id;
import com.demo.rest.Table;

@Entity
@Table(name="tb_product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
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