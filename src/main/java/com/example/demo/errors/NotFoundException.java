package com.example.demo.errors;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class NotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2706904608126555371L;
	
	public NotFoundException(String message) {
		super(message);
	}
	
}
