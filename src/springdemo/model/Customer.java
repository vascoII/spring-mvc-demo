package springdemo.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import springdemo.validation.CourseCode;
import springdemo.validation.FirstName;

public class Customer {

	@NotNull(message="is required")
	@FirstName
	@Size(min=1, max = 10, message="length must be between 1 and 10")
	private String firstName;
	
	@NotNull(message="is required")
	@NotEmpty(message = "LastName can not be empty")
	@Size(min=1, max = 10, message="length must be between 1 and 10")
	private String lastName;
	
	@NotNull(message="is required")
	@Pattern(regexp="^[a-zA-Z0-9]{5}", message="only 5 chars/digits")
	private String postalCode;
	
	@NotNull(message="is required")
	@Min(value = 18, message = "You must have 18 at least")
	@Max(value = 77, message = "You can not be more than 77")
	private Integer age;
	
	@NotNull(message="is required")
	@CourseCode
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (!firstName.isEmpty()) {
			this.firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
		} else {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (!lastName.isEmpty()) {
			this.lastName = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
		} else {
			this.lastName = lastName;
		}
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

		
}
