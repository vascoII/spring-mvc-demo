package springdemo.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Customer {

	@NotNull(message="is required")
	@Size(min=1, max = 10, message="length must be between 1 and 10")
	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1, max = 10, message="length must be between 1 and 10")
	private String lastName;

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
	
	
}
