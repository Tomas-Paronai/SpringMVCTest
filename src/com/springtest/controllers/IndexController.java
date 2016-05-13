package com.springtest.controllers;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springtest.obj.FormModel;
import com.springtest.obj.TimeModel;

@Controller
public class IndexController {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld(){
		ModelAndView welcomePage = new ModelAndView("welcome");
		String message = "<br><h3 id=\"text\">Hello World Sring Test Application</h3><br>";
		String text = "Hello World Sring Test Text change on Button Click!!";
		TimeModel time = new TimeModel(new Date());
		welcomePage.addObject("message", message);
		welcomePage.addObject("text",text);
		welcomePage.addObject("time",time);
		return welcomePage;
	}
	
	@RequestMapping(value="/showMeResults" , method=RequestMethod.POST)
	public ModelAndView showResults(@ModelAttribute("formVals") FormModel model){
		ModelAndView results = new ModelAndView("formResults");
		model = new FormModel();
		return results;
	}
}
