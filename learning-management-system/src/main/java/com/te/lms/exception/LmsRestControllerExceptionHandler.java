package com.te.lms.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@RestControllerAdvice
public class LmsRestControllerExceptionHandler extends ResponseEntityExceptionHandler{

//	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
//   public ResponseEntity<Object> handleHttpRequestMethodNotSupported(
//            HttpRequestMethodNotSupportedException ex, WebRequest request) {
//        String message = "Change your request method type";
//        return new ResponseEntity<>(message, HttpStatus.METHOD_NOT_ALLOWED);
//    }
	
	 @ExceptionHandler(NullPointerException.class)
	    public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
	        String errorMessage = "NullPointerException occurred: " + ex.getMessage();
	        return new ResponseEntity<>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
	    }
	 
	  @ExceptionHandler(NoSuchElementException.class)
	    public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex) {
	        String errorMessage = "Resource not found : " + ex.getMessage();
	        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
	    }
	  


	     
}
