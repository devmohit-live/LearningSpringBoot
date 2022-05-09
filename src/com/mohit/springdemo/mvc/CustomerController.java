package com.mohit.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@RequestMapping("showForm")
	public String showForm(Model model) {
		model.addAttribute("customer", new Customer());	
		return "customer-form";
	}
	
	//@Valid is for validity of modelattribute and validator implemeting method(processForm here) also take BindingResult as paam
	//@Valid: preform validation rules
	//BindingResult: result of validation is places in here
	
	@RequestMapping("processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer customer, BindingResult bindingResult) {
		if(bindingResult.hasErrors())
			return "customer-form"; //go back 
		
		return "customer-confirmation";
	}

}
