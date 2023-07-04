package com.spring.mydairy.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.spring.mydairy.services.UserServices;

@Controller
public class HomeController {
	
	@Autowired
	private UserServices  userServices;
	
	@Autowired
	HttpSession session;	

	public UserServices getUserServices() {
		return userServices;
	}

	public void setUserServices(UserServices userServices) {
		this.userServices = userServices;
	}
	
	
	@RequestMapping("login")
	public ModelAndView firstPage() {
		return new ModelAndView("loginpage");
	}
	
	@RequestMapping("register")
	public ModelAndView secondPage() {
		return new ModelAndView("registrationpage");
	}

	
	

}
