package com.mohit.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("showForm")
	public String showForm(Model model) {
		//create student
		Student student = new Student();
		//add attribute to model
		model.addAttribute(student);
		
		return "student-form"; //jsp name
	}
	
	@RequestMapping("processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		//logging data
		System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getCountry());
		return "student-confirmation";
	}
}
