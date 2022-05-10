package com.example.demo;

public class InvalidProductId extends RuntimeException {

	public InvalidProductId() {}
	
	public InvalidProductId(String message) {
		super(message);
	}
}

