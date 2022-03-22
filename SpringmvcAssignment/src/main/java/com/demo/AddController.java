package com.demo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
				
		String Password = "HelloWorld";
		String k;
		
		String i = request.getParameter("t1");
		String j = request.getParameter("t2");
		
		if(j==Password)
		{
			k = "Logged In SuccessFully";
		}
		else
		{
			k = "Password Incorrect";
		}
		
		
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",k);
		
		return mv;
		
		
	}

}
