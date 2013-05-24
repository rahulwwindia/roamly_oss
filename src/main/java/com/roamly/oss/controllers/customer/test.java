package com.roamly.oss.controllers.customer;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.oreilly.servlet.MultipartRequest;
import com.roamly.oss.model.customer.MyForm;

@Controller
@RequestMapping("customer")
public class test{
	static final Logger logger = Logger.getLogger(test.class);
	
	  
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
	
	@RequestMapping(value = "uploadServlet.htm")
	public String upLoadFile(HttpServletRequest request,HttpServletResponse response,Object command) {
	
	
		
		return "myFormDate"; 
	}
	
}

