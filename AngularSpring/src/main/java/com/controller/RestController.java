package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RestController {

	@RequestMapping(path="/saludo", method=	RequestMethod.GET)
	@ResponseBody
	public String saludo() {
		return "Hola Rest!!!!!";
	}
}
