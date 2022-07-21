package com.example.demo.errors;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CustomRestExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<Object> handleResourceNotFoundExceptions(NotFoundException ex,
			WebRequest request) {
		ApiException exception = new ApiException("/errors/resource-not-found", "Resource not found",
				HttpStatus.NOT_FOUND.value(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<Object>(exception,new HttpHeaders(),exception.getStatus());
	}
	
	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		// TODO Auto-generated method stub
		String error = String.format("No handler found for %s  %s", ex.getHttpMethod(),ex.getRequestURL());
		ApiException exception = new ApiException("/errors/no-handler-found", "Resource not found", status.value()
				, ex.getCause().toString(), request.getDescription(false));
		return new ResponseEntity<Object>(exception,new HttpHeaders(),exception.getStatus());
	}
}
