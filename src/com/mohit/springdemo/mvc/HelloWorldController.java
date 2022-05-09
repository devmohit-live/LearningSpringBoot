package com.mohit.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.support.StandardMultipartHttpServletRequest;

@Controller
public class HelloWorldController {

	//controller to show initial form
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
//	need a controller method to process a form
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
//	
	@RequestMapping("/processFormV2")
	public String letsShoutDude(HttpServletRequest request,Model model) {
		//read req parameter
		String name = request.getParameter("studentName");
		//covert data to to all caps
		name.toUpperCase();
		String result = "Yo! " + name;
		//add message to model
		model.addAttribute("message",result);
		
		return "helloworld";
	}
	
}
