package com.sun.cics.constant;

import java.text.MessageFormat;
import java.util.Map;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/constants.properties")
public class Constants {
	

	// 未找到异常代码
	public static final String ERROR_EXCEPTION_CODE_NOT_FIND = "ERROR_EXCEPTION_CODE_NOT_FIND";
	
	public class Common{
		// 参数为空
		public static final String ERROR_NULL_VALUE= "ERROR_NULL_VALUE";
	}
	
	public class Login{
		
		
	}
	
	public class User{
		
		public static final String ERROR_ACCOUNT_NOT_FOUND = "ERROR_ACCOUNT_NOT_FOUND";
	}
	
	

	private static Map<String, String> exceptions;

	public Map<String, String> getExceptions() {
		return exceptions;
	}

	public void setExceptions(Map<String, String> exceptions) {
		this.exceptions = exceptions;
	}
	
	public static String getErrMsg(String k) {
		if (!exceptions.containsKey(k)) {
			k = ERROR_EXCEPTION_CODE_NOT_FIND;
		}
		return exceptions.get(k).toString();
	}

	public static String getErrMsg(String k, Object p1) {
		if (p1 == null) {
			p1 = "";
		}
		return MessageFormat.format(getErrMsg(k), p1);
	}

	public static String getErrMsg(String k, Object p1, Object p2) {
		return MessageFormat.format(getErrMsg(k), p1, p2);
	}

	public static String getErrMsg(String k, Object p1, Object p2, Object p3) {
		return MessageFormat.format(getErrMsg(k), p1, p2, p3);
	}

	public static String getErrMsg(String k, Object p1, Object p2, Object p3, Object p4) {
		return MessageFormat.format(getErrMsg(k), p1, p2, p3, p4);
	}
	
}
