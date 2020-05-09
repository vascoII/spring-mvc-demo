package springdemo.controller;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import springdemo.model.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//add initBinde to convert trim input strings
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);		
	}
	
	@RequestMapping("/showForm")
	public String showForm(Model customerModel) {
		// add customer object to the model 
		customerModel.addAttribute("customer", new Customer());

		return "customer-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(
			@Valid @ModelAttribute("customer") Customer customer, 
			BindingResult bindResult
	) {
		System.out.println("First name : |" + customer.getFirstName() + "|");
		System.out.println("Last name : |" + customer.getLastName() + "|");
		if (bindResult.hasErrors()) {
			return "customer-form";
		} else {
			return "customer-confirmation";
		}
	}
}
