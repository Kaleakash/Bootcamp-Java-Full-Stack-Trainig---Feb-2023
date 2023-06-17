package com.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Login;
import com.service.LoginService;
@Controller
public class LoginController {

	@RequestMapping(value = "loginCheck",method = RequestMethod.POST)
	public ModelAndView checkLoginDetails(HttpServletRequest req) {
		String emailid = req.getParameter("email");
		String password  = req.getParameter("pass");
		ModelAndView mav = new ModelAndView();
		if(emailid.equals("akash@gmail.com") && password.equals("123")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	@Autowired
	LoginService loginService;
	@RequestMapping(value = "signIn",method = RequestMethod.POST)
	public ModelAndView signIn(HttpServletRequest req,Login ll) {
		String emailid = req.getParameter("email");
		String password  = req.getParameter("pass");
		ll.setEmailid(emailid);
		ll.setPassword(password);
		ModelAndView mav = new ModelAndView();
		String result = loginService.signIn(ll);
		if(result.equals("success")) {
			mav.setViewName("success.jsp");
		}else {
			mav.setViewName("failure.jsp");
		}
		return mav;
	}
	@RequestMapping(value = "signUp",method = RequestMethod.POST)
	public ModelAndView signUp(HttpServletRequest req,Login ll) {
		String emailid = req.getParameter("email");
		String password  = req.getParameter("pass");
		ll.setEmailid(emailid);
		ll.setPassword(password);
		ModelAndView mav = new ModelAndView();
		String result = loginService.signUp(ll);
		//System.out.println(result);
		mav.addObject("msg", result);   // model scope ie request.setAttribute("key",value);
		mav.setViewName("signUp.jsp");
		return mav;
	}
}
