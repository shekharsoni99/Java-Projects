package com.example.demo;

public class EmptyProductList extends RuntimeException {
	public EmptyProductList() {
		
	}
	
	public EmptyProductList(String message) {
		super(message);
	}
}