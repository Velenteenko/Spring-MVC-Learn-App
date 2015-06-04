package com.ua.vde.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ua.vde.objects.UserData;

@Controller
public class LogController {

	// private static final Logger logger =
	// LoggerFactory.getLogger(LogController.class);

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView main() {
		return new ModelAndView("login", "user", new UserData());
	}

	@RequestMapping(value = "/check-user", method = RequestMethod.POST)
	public ModelAndView checkUser(@ModelAttribute("user") UserData userData) {
		// ModelAndView modelAndView = new ModelAndView();
		// modelAndView.setViewName("main");
		// modelAndView.addObject("user", userData);
		// return modelAndView;
		return new ModelAndView("main", "user", userData);
	}
	
	@RequestMapping(value="/failed-user", method = RequestMethod.GET)
	public ModelAndView failed(){
		return new ModelAndView("failed", "message", "Message: Failed!");
	}

}
