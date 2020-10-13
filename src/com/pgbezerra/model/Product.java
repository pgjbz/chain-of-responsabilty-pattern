package com.pgbezerra.model;

import com.pgbezerra.model.enums.Size;

public class Product {
	
	private String name;
	private Double value;
	private Size size;

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(String name, Double value, Size size) {
		this.name = name;
		this.value = value;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", value=" + value + ", size=" + size + "]";
	}
	

}
