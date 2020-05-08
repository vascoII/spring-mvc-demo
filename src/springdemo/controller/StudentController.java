package springdemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springdemo.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}") 
	private Map<String, String> countryOptions;

	@RequestMapping("/showForm")
	public String showForm(Model studentModel) {
		Student student = new Student();
		// add student object to the model 
		studentModel.addAttribute("student", student);
		// add the country options to the model 
		studentModel.addAttribute("theCountryOptions", countryOptions); 
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student student) {
		return "student-confirmation";
	}
}
