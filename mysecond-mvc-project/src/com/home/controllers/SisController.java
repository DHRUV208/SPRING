package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeupkit")
	public String giveMakeUp() {
		return "makeup given";
	}
	
	
	@RequestMapping("/books")
	public String getBooks() {
		return "HCVerma";
	}
}
