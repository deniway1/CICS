package com.sun.cics.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {

	@RequestMapping("/hello")
    public String hello(Map<String,Object> map){
		map.put("hello", "from TemplateController.helloHtml");
        return "/hello";
    }
}
