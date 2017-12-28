package com.sun.cics.controller.login;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.cics.bean.TBasUser;

@Controller
public class LoginController {
	
	@Autowired
	private HttpServletRequest req;

	@RequestMapping("/init")
	public String init() {
		return "index.html";
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestParam TBasUser user) {
		return "welcome";
	}
}
