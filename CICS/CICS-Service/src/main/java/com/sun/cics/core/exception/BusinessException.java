package com.sun.cics.core.exception;

import java.text.MessageFormat;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties
@PropertySource("classpath:config/exception.properties")
public class BusinessException extends RuntimeException {

	// 未找到异常代码
	public static final String EXCEPTION_CODE_NOT_FIND = "EXCEPTION_CODE_NOT_FIND";

	private Map<String, String> exceptions;

	// 错误码
	private String errorCode;

	// 错误描述
	private String errorMsg;

	// 数据
	private Object data;

	/**
	 * 
	 * @param errorCode	异常编码
	 */
	public BusinessException(String errorCode) {
		this.errorCode = errorCode;
		this.errorMsg = this.getErrMsg(errorCode);
	}
	
	/**
	 * 
	 * @param errorCode 异常编码
	 * @param p1	第一个可变参数
	 */
	public BusinessException(String errorCode, String p1) {
		this.errorCode = errorCode;
		this.errorMsg = getErrMsg(errorCode,p1);
	}
	
	/**
	 * 
	 * @param errorCode	异常编码
	 * @param p1	第一个可变参数
	 * @param p2	第二个可变参数
	 */
	public BusinessException(String errorCode, String p1, String p2) {
		this.errorCode = errorCode;
		this.errorMsg = getErrMsg(errorCode,p1,p2);
	}

	/**
	 * 
	 * @param errorCode	异常编码
	 * @param p1	第一个可变参数
	 * @param data	异常数据
	 */
	public BusinessException(String errorCode, String p1, Object data) {
		this.data = data;
		this.errorMsg = getErrMsg(errorCode,p1);
		this.errorCode = errorCode;
	}
	
	/**
	 * .
	 * @param errorCode 异常编码
	 * @param p1	第一个可变参数
	 * @param p2	第二个可变参数
	 * @param data	异常数据
	 */
	public BusinessException(String errorCode, String p1, String p2, Object data) {
		this.errorCode = errorCode;
		this.errorMsg = getErrMsg(errorCode,p1,p2);
		this.data = data;
	}
	
	/**
	 * 
	 * @param data	异常数据
	 * @param errorCode	异常编码
	 * @param errMsg	异常信息
	 */
	public BusinessException(Object data, String errorCode, String errMsg) {
		this.data = data;
		this.errorMsg = errMsg;
		this.errorCode = errorCode;
	}

	public String getErrMsg(String k) {
		if (!exceptions.containsKey(k)) {
			k = EXCEPTION_CODE_NOT_FIND;
		}
		return exceptions.get(k);
	}

	public String getErrMsg(String k, Object p1) {
		if (p1 == null) {
			p1 = "";
		}
		return MessageFormat.format(getErrMsg(k), p1);
	}

	public String getErrMsg(String k, Object p1, Object p2) {
		return MessageFormat.format(getErrMsg(k), p1, p2);
	}

	public String getErrMsg(String k, Object p1, Object p2, Object p3) {
		return MessageFormat.format(getErrMsg(k), p1, p2, p3);
	}

	public String getErrMsg(String k, Object p1, Object p2, Object p3, Object p4) {
		return MessageFormat.format(getErrMsg(k), p1, p2, p3, p4);
	}

	public Map<String, String> getExceptions() {
		return exceptions;
	}

	public void setExceptions(Map<String, String> exceptions) {
		this.exceptions = exceptions;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
