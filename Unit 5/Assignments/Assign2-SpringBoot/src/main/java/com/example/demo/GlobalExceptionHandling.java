package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandling {

	@ExceptionHandler(InvalidProductId.class)
	public ResponseEntity<MyError> invalidProductIdHandler(InvalidProductId ivId, WebRequest request) {
		
		MyError err = new MyError(LocalDateTime.now(), ivId.getMessage(), request.getDescription(false));
		return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyError> myDefaultExceptionHandler(NoHandlerFoundException nfe, WebRequest request) {
		
		MyError err = new MyError(LocalDateTime.now(), nfe.getMessage(), request.getDescription(false));
		return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(EmptyProductList.class) 
	public ResponseEntity<MyError> emptyProductListHandler(EmptyProductList epl, WebRequest request){
		
		MyError err = new MyError(LocalDateTime.now(), epl.getMessage(), request.getDescription(false));
		return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyError> argumentNotValidExceptionHandler(MethodArgumentNotValidException mve, WebRequest request) {
		
		MyError err = new MyError(LocalDateTime.now(), mve.getBindingResult().getFieldError().getDefaultMessage(), request.getDescription(false));
		return new ResponseEntity<MyError>(err, HttpStatus.BAD_REQUEST);
	}
}
 