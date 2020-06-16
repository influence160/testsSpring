package com.example.demo.model;

import java.time.LocalDate;

public class Aaa {

	private String name;
	private int quantity;
	private LocalDate date;
	
	
	
	public Aaa(String name, int quantity, LocalDate date) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public int getQuantity() {
		return quantity;
	}
	public LocalDate getDate() {
		return date;
	}
	
	
}
