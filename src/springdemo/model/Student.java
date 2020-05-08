package springdemo.model;

import java.util.LinkedHashMap;

public class Student {

	public String firstName;
	public String lastName;
	public String country;
	
	private LinkedHashMap<String, String> countryOptions;
	
	public Student() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("FR", "France");
		countryOptions.put("PT", "Portugal");
		countryOptions.put("SP", "Spain");
		countryOptions.put("UK", "England");
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
	
}
