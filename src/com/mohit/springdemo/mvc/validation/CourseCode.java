package com.mohit.springdemo.mvc.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface CourseCode {
	//define default course code
	public String value() default "CS";
	// define default error msg
	public String message() default "must start with CS";
	// define default groups
	// used to group commom validations
	public Class<?>[] groups() default {};
	//define defautl payloads 
	// tells cutome details about validation failure : severity level, error codes ,etc
	public Class<? extends Payload>[] payload() default {};
}
