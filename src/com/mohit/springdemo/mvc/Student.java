package com.mohit.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName, lastName;
	private String country;
	private LinkedHashMap<String, String> countryOptions;
	private String favouriteLanguage; //this can also e done in second way using LinkedHashMap
	
	public Student() {
		this.countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("IN", "India");
		countryOptions.put("FR", "France");
		countryOptions.put("RS", "Russia");
		countryOptions.put("US", "America");
	}
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}
	public String getFavouriteLanguage() {
		return favouriteLanguage;
	}
	public void setFavouriteLanguage(String favouriteLanguage) {
		this.favouriteLanguage = favouriteLanguage;
	}
	
	
}
