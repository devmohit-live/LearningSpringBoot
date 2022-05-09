package com.mohit.springdemo.mvc;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Customer {


	private String firstName;
	
	
	@NotNull(message="is required")
	
	@Size(min=2, message = "is required")
	//Error: n white spaces can paas this check
	private String lastName;
	
	@Min(value=0, message = "must be greater than or equal to 0")
	@Max(value = 10, message = "must be less than or equals to 10")
	private int freePasses;
	
	@NotNull(message = "is mandatory")
	@Pattern(regexp ="^[a-zA-Z0-9]{5}", message = "Invalid Postal Code, must be a 5 digit chars/numbers")
	private String postalCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(int freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
}
