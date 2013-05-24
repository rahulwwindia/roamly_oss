package com.roamly.oss.controllers.security;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

	@RequestMapping(value = "login.htm")
	public void testLogin() {
		System.out.println("Login Controller");
	}
	
	@RequestMapping(value = "loginRole.htm")
	public String switchRole(HttpSession session) {
		String userRole=(String) session.getAttribute("userRole");
		System.out.println("In Login Controller :"+userRole);
		
		if(userRole.equalsIgnoreCase("ROLE_ADMIN"))
		return "redirect:admin/myForm.htm"; 
		
		if(userRole.equalsIgnoreCase("ROLE_USER"))
			return "redirect:customer/myForm.htm";
		  
		return "redirect:loginfailed.htm";
		 
	}   
	
	@RequestMapping(value = "loginfailed.htm")
	public String loginFail(Model model) {
		System.out.println("Test Inception OSS");
		model.addAttribute("error", "true"); 
		return "login";
	}
	 
}
