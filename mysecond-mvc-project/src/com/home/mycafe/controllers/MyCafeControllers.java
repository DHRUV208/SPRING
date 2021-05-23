package com.home.mycafe.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	// return the welcome-page
	@RequestMapping("/cafe")
	public String showWelcomePage(Model model) {

		// sending data to view

		return "welcome-page";

	}

	@RequestMapping("/processOrder")
	public String processOrder(HttpServletRequest request, Model model) {

		// handle the datarecieved from user
		// set the user data with the model object and send it to view

		String userValue = request.getParameter("foodType");
		// adding the captured value to the model
		model.addAttribute("userInput", userValue);
		return "process-order";
	}

}
