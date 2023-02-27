package com.example;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {

	@Autowired
	Environment environment;
	
	@Autowired
	ErrorInfo errorInfo;
//	
//	@ExceptionHandler(Exception.class)
//	public ResponseEntity<ErrorInfo> exceptionHandler(Exception exception){
//		errorInfo.setErrorMessage(environment.getProperty("General.EXCEPTION_MESSAGE"));
//		errorInfo.setErrorCode(HttpStatus.INTERNAL_SERVER_ERROR.value());
//		errorInfo.setTimestamp(LocalDateTime.now());
//		return new ResponseEntity<ErrorInfo>(errorInfo,HttpStatus.INTERNAL_SERVER_ERROR);
//	}
//	@ExceptionHandler(InfyException.class)
//	public ResponseEntity<String> infyExceptionHandler(InfyException exception){
//		return new ResponseEntity<String>(exception.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<ErrorInfo> exceptionHandler(MethodArgumentNotValidException exception) {
			ErrorInfo errorInfo = new ErrorInfo();
			errorInfo.setErrorCode(HttpStatus.BAD_REQUEST.value());
		    errorInfo.setTimestamp(LocalDateTime.now());
		    String errorMsg = exception.getBindingResult().getAllErrors().stream().map(x -> x.getDefaultMessage())
					.collect(Collectors.joining(", "));
			errorInfo.setErrorMessage(errorMsg);
		
			return new ResponseEntity<>(errorInfo, HttpStatus.BAD_REQUEST);
	}
	    
}
