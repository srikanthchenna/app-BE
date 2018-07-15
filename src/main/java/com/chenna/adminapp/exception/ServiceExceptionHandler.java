package com.chenna.adminapp.exception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
@EnableWebMvc
@ControllerAdvice
public class ServiceExceptionHandler extends ResponseEntityExceptionHandler {

	@ExceptionHandler(Throwable.class)
	@ResponseBody
	public ResponseEntity<Object> handleControllerException(HttpServletRequest req, Throwable ex) {
		ErrorResponse errorResponse = new ErrorResponse(ex);
		return ResponseEntity.status(HttpStatus.CONFLICT).body(errorResponse);
	}

	@Override
	protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex, HttpHeaders headers,
			HttpStatus status, WebRequest request) {
		Map<String, String> responseBody = new HashMap<>();
		responseBody.put("path", request.getContextPath());
		responseBody.put("message", "The URL you have reached is not in service at this time (404).");
		return new ResponseEntity<Object>(responseBody, HttpStatus.NOT_FOUND);
	}
}
