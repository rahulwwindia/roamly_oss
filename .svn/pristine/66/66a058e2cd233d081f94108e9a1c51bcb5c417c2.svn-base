package com.roamly.oss.controllers.customer;


import java.io.File;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

 
@Controller
@RequestMapping(value="FileUploadForm.htm")
public class UploadFormController implements HandlerExceptionResolver{
	
	@RequestMapping(method=RequestMethod.GET)
	public String showForm(ModelMap model){
		UploadForm form = new UploadForm();
		model.addAttribute("FORM", form);
		return "myFormDate";
	}

	@RequestMapping(method=RequestMethod.POST)
	public String processForm(@ModelAttribute(value="FORM") UploadForm form,BindingResult result){
		if(!result.hasErrors()){
			FileOutputStream outputStream = null;
			String filePath = "/home/webwerks/PolarWork/roamly-oss" + "/" + form.getFile().getOriginalFilename();
			try { 
				outputStream = new FileOutputStream(new File(filePath));
				outputStream.write(form.getFile().getFileItem().get());	
				outputStream.close();
			} catch (Exception e) {
				System.out.println("Error while saving file");
				return "myFormDate";
			}
			ReadXLSFile reader = new ReadXLSFile();
			reader.readXLS(filePath);
			return "success";
		}else{
			return "myFormDate";
		}		
	}
	 

	public ModelAndView resolveException(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception exception) {
		Map<Object, Object> model = new HashMap<Object, Object>();
        if (exception instanceof MaxUploadSizeExceededException)
        {
            model.put("errors", "File size should be less then "+((MaxUploadSizeExceededException)exception).getMaxUploadSize()+" byte.");
        } else 
        {
            model.put("errors", "Unexpected error: " + exception.getMessage());
        }
        model.put("FORM", new UploadForm());
        return new ModelAndView("myFormDate", (Map) model);

	}
}
