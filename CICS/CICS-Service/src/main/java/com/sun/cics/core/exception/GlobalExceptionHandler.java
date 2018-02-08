package com.sun.cics.core.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.sun.cics.vo.ErrorInfo;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = BusinessException.class)
	public ErrorInfo<String> businessErrorHandler(HttpServletRequest req,BusinessException e) {
		ErrorInfo<String> r = new ErrorInfo<>();
		r.setMessage(e.getMessage());
		r.setCode(e.getMessage());
		r.setData(e.getMessage());
		r.setUrl(req.getRequestURL().toString());
		return r;
	}
	
	@ExceptionHandler(value = Exception.class)
	public ErrorInfo<String> commonErrorHandler(HttpServletRequest req,Exception e) {
		ErrorInfo<String> r = new ErrorInfo<>();
		r.setMessage(e.getMessage());
		r.setCode(e.getMessage());
		r.setData(e.getMessage());
		r.setUrl(req.getRequestURL().toString());
		return r;
	}
}
