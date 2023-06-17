package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping(value = "open")
	public ModelAndView openAnotherPage() {
		System.out.println("Welcome");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("hello.html");
		return mav;
	}
}
