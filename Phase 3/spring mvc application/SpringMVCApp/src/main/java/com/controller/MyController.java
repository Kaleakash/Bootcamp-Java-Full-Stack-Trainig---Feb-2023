package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "hello",method = RequestMethod.GET)
	public ModelAndView openDisplayPage() {
		ModelAndView mav = new ModelAndView();
		// do some task 
		mav.setViewName("display.jsp");
		System.out.println("I Came here");
		return mav;
	}
	
	@RequestMapping(value = "hi",method = RequestMethod.GET)
	public ModelAndView openAnotherPage() {
		ModelAndView mav = new ModelAndView();
		// do some task 
		mav.setViewName("welcome.jsp");
		System.out.println("I Came here");
		return mav;
	}
}
