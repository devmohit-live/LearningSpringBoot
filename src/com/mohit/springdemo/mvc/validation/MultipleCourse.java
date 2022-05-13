package com.mohit.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = MultileCourseConstraintValidator.class)
@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
public @interface MultipleCourse {
	// add default course code values'
	public String[] value() default {"CS","IT"};
	
	// define default error code
	public String message() default "must start with predefined code";
	
	// used to group commom validations
	public Class<?>[] groups() default {};
	
	//define defautl payloads 
	// tells cutome details about validation failure : severity level, error codes ,etc
	public Class<? extends Payload>[] payload() default {};
		
}
