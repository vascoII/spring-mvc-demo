package springdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstNameConstraintValidator implements ConstraintValidator<FirstName, String> {

	@Override
	public boolean isValid(String theFirstName, ConstraintValidatorContext theConstraintValidatorContext) {
		if (theFirstName == null) {
			return false;
		}
		return true;
	}

}
