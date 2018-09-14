package com.telusko.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		// Just Creating ModelAndView to make code easy removed all HttpSession and all these thing :)
		ModelAndView mv = new ModelAndView();
		// Setting MvelAndView Object
		mv.addObject("alienObject", alien);
		// Setting MvelAndView page
		mv.setViewName("home");
		return mv;
	}
}
