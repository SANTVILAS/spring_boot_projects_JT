package com.thenxtprogrammer.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler {

	@ExceptionHandler(CustomeResponseException.class)
	public ResponseEntity<String> handleCustomeResponseException(CustomeResponseException e) {
		return new ResponseEntity<>(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<String> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {

		return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
	}

}
