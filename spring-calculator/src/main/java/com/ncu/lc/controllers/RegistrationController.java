package com.ncu.lc.controllers;

import java.nio.charset.IllegalCharsetNameException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ncu.lc.api.CommunicationDTO;
import com.ncu.lc.api.Phone;
import com.ncu.lc.api.UserRegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userRegister") UserRegistrationDTO userRegistrationDTO) {
		userRegistrationDTO.setName("abhi");
		userRegistrationDTO.setName("abhi123@");
		System.out.println("inside showRegistrationMethod");

		// load the saved user data from db
		Phone phone = new Phone();
		phone.setCode("91");
		phone.setUsernumber("2233445566");

		CommunicationDTO communicationDTO = new CommunicationDTO();
		communicationDTO.setPhone(phone);
		userRegistrationDTO.setCommunicationDTO(communicationDTO);
		;

		return "user-registration-page";
	}

	@RequestMapping("/registration-sucess")
	public String processUserRegistration(@ModelAttribute("userRegister") UserRegistrationDTO userRegistrationDTO) {
		System.out.println("inside processRegistrationMethod");

		// save the dto object in to our db

		return "registration-sucess";
	}
}
