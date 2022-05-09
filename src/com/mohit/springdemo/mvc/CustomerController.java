package com.mohit.springdemo.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
		
		//debug/logging
		System.out.println("Last Name | "+customer.getLastName()+" | ");
				
		if(bindingResult.hasErrors())
			return "customer-form"; //go back 
		
		return "customer-confirmation";
	}
	
	
	//add an initbinder to remove all trailing and leading whtespace, also when there is just all whitespace convert it to null
	//resolve issues for our validation
	//do this for all string classes by default : register that
	
	// PreProcessor
	@InitBinder
	public void checkForWhiteSpaces(WebDataBinder webDataBinder) {
		//default class to do the job : true as constructor param: convert null if all whitespaces 
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		// register to perform this operation on all string classes
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

}
