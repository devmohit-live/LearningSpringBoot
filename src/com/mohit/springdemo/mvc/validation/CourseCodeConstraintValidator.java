package com.mohit.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

// CourseCode validation is used on String type
public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String>{

	private String coursePrefix;
	@Override
	public void initialize(CourseCode constraintAnnotation) {
		// TODO Auto-generated method stub
		coursePrefix = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		//arg0 : code
		//arg1 : additional msgs
		if(arg0!= null && arg0.startsWith(coursePrefix)) return true;
		
		return false;
	}

}
