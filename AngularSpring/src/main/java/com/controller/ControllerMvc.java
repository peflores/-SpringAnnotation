package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Controller annotation on class name declares this class as spring bean and
 *  @RequestMapping annotation declares that this class is default handler for all requests of type ‘/’
 *	First method does not have any mapping declared so, it will inherit the mapping from mapping declared
 *	 on class level, acting as default handler for GET requests. 
 *	Second method (due to additional mapping declaration with value attribute) will serve the request 
 *	of form /helloagain. Attribute method says which type of HTTP request this method can serve. 
 *	ModelMap is a Map implementation, which here acting as replacement of 
 *	[request.getAttribute()/request.setAttribute()]setting values as request attribute. 
 *	Note that we are returning “welcome” string form this method. 
 * @author pflores
 *
 */
@Controller
@RequestMapping("/") //http:ip:port/context/
public class ControllerMvc {
	//by default 
	@RequestMapping(method = RequestMethod.GET)
    public String sayHello(ModelMap model) {
    
        return "home";
    }
	//http:ip:port/context/helloagain
    @RequestMapping(value = "/helloagain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap model) {
        model.addAttribute("greeting", "Hello World Again, from Spring 4 MVC");
        return "home";
    }
}
