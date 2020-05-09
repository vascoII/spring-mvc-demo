package springdemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="is required")
	@Size(min=1, max = 10, message="length must be between 1 and 10")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, max = 10, message="length must be between 1 and 10")
	private String lastName;
	
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	@Min(value = 18, message = "You must have 18 at least")
	@Max(value = 77, message = "You can not be more than 77")
	private int age;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

		
}
