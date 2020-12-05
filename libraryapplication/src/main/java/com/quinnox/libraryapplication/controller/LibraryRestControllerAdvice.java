package com.quinnox.libraryapplication.controller;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.quinnox.libraryapplication.dto.LibraryResponse;
import com.quinnox.libraryapplication.exception.LibraryException;

@RestControllerAdvice
public class LibraryRestControllerAdvice {

	@ExceptionHandler
	public LibraryResponse myExceptionHandler(LibraryException libraryException) {
		LibraryResponse response = new LibraryResponse();
		
		response.setError(true);
		response.setMessage(libraryException.getMessage());
		return response;

	}

}
