package com.javan.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.javan.security.CSRFTokenManager;

@Controller
public class CommonController {
	
	@RequestMapping(value = "csrf-demo",method=RequestMethod.GET)
	public String demo(ModelMap model) {
return "/csrf-demo";
	}
	
	@RequestMapping(value = "csrf-submit",method=RequestMethod.POST)
	public String submit(HttpServletRequest request, ModelMap model) {
		String val = request.getParameter("val");
		model.addAttribute("val", val);
		return "csrf-demo";
	}
}
