package net.codejava.spring.controller;

import java.util.Map;

import net.codejava.spring.model.User;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/register")
public class RegisterController {

	@RequestMapping(method = RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
		User userForm = new User();		
		model.put("userForm", userForm);
		
		return "Registration";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String processRegistration(@ModelAttribute("userForm") User user, 
			Map<String, Object> model) {
		
		// implement your own registration logic here...
		
		// for testing purpose:
		System.out.println("firstName: " + user.getFirstName());
		System.out.println("lastName: " + user.getLastName());
		System.out.println("email: " + user.getEmail());
		System.out.println("address1: " + user.getAddress1());
		System.out.println("address2: " + user.getAddress2());
		System.out.println("postcode: " + user.getPostcode());
		System.out.println("city: " + user.getCity());
		System.out.println("nameCard: " + user.getNameCard());
		System.out.println("numberCard: " + user.getNumberCard());
		System.out.println("expiryDate: " + user.getExpiryDate());
		System.out.println("securityCard: " + user.getSecurityCard());
		

		
		return "RegistrationSuccess";
	}
}
