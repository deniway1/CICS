package com.sun.cics.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.cics.core.config.ServerConfig;

@Controller
public class TestController {

	@Autowired
	private ServerConfig config;
	
	@RequestMapping("/home")
    public String hello(Map<String,Object> map){
		map.put("hello", config.getName());
        return "hello.html";
    }
}
