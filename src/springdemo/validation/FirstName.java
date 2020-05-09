package springdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = FirstNameConstraintValidator.class)
@Target({ ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstName {

	//define default first name
	public String value() default "";
	//define default error message
	public String message() default "First Name can not be empty";
	//define default groups
	public Class<?>[] groups() default {};
	//define default payloads
	public Class<? extends Payload>[] payload() default {};
}
