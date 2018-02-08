package com.sun.cics.core.exception;

public class BusinessException extends RuntimeException {

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
	public BusinessException() {
		super();
	}

	/**
	 * 
	 * @param errorCode	异常编码
	 */
	public BusinessException(String errorCode) {
		this.errorCode = errorCode;
	}
	
	/**
	 * 
	 * @param errorCode 异常编码
	 * @param errorMsg	异常信息
	 */
	public BusinessException(String errorCode, String errorMsg) {
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}
	
	/**
	 * 
	 * @param errorCode	异常编码
	 * @param errorMsg	异常信息
	 * @param data	异常数据
	 */
	public BusinessException(String errorCode, String errorMsg, Object data) {
		this.data = data;
		this.errorMsg = errorMsg;
		this.errorCode = errorCode;
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
