package com.roamly.oss.controllers.administrator;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.roamly.oss.model.customer.MyForm;

@Controller
@RequestMapping("admin")
public class Admin {
	static final Logger logger = Logger.getLogger(Admin.class);
	
	@RequestMapping(value = "myForm.htm")
	public String myForm(@ModelAttribute("myForm") MyForm myForm) {
		//PropertyConfigurator.configure("log4j.properties");
		logger.debug("Sample debug message"); 
		logger.info("Sample info message");  
		logger.warn("Sample warn message"); 
		logger.error("Sample error message");
		logger.fatal("Sample fatal message");
		 return "myForm";
	}   
	
	@RequestMapping(value = "myFormDate.htm")
	public String myFormDate() {
		System.out.println("Test Inception OSS");
		return "myFormDate"; 
	} 
}
