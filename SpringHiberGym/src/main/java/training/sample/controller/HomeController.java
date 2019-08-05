package training.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/About")
	public ModelAndView About()
	{
	   return new ModelAndView("About");
	}
	

	@RequestMapping("/Contact")
	public ModelAndView Contact()
	{
	   return new ModelAndView("Contact");
	}
	
	@RequestMapping("/Home")
	public ModelAndView Home()
	{
	   return new ModelAndView("Home");
	}
	
	@RequestMapping("/Program")
	public ModelAndView Program()
	{
	   return new ModelAndView("Program");
	}
	
	@RequestMapping("/Team")
	public ModelAndView Trainers()
	{
	   return new ModelAndView("Team");
	}
	
	
}
