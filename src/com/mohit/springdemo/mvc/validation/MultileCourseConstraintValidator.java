package com.mohit.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MultileCourseConstraintValidator implements ConstraintValidator<MultipleCourse, String> {

	private String[] courseIds;
	@Override
	public void initialize(MultipleCourse constraintAnnotation) {
		// TODO Auto-generated method stub
		courseIds = constraintAnnotation.value();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		if(arg0 == null) return false;
		for(String courseId : courseIds)
			if(arg0.startsWith(courseId)) return true;
		return false;
	}

}
