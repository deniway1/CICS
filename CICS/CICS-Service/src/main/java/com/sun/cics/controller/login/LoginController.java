package com.sun.cics.controller.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sun.cics.bean.TBasUser;
import com.sun.cics.constant.Constants;
import com.sun.cics.service.user.IUserService;

@Controller
public class LoginController {
	
	@Autowired
	private IUserService userService;
	
	@Autowired
	private Constants cont;

	@RequestMapping("/init")
	public String init() {
		cont.getExceptions();
		return "index";
	}
	
	
	@RequestMapping("/login")
	public String login(@RequestParam String account,@RequestParam String pass) {
		TBasUser user = userService.queryUserByAccount(account);
		return "welcome";
	}
}
