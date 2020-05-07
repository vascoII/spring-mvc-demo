package springdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm() {
		return "process-hello-form";
	}
	
	@RequestMapping("/processFormVersionTwo")
	public String processFormWithUpperCase(HttpServletRequest request, Model model) {
		String name = request.getParameter("name");
		name = name.toUpperCase();
		
		String message = "Yo! " + name;
		
		model.addAttribute("message", message);
		
		return "process-hello-form";
	}
}
