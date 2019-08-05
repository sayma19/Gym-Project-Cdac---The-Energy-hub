package training.sample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.sample.model.Admin;
import training.sample.model.Trainer;
import training.sample.service.TrainerService;
@Controller
public class TrainerController {

	
	@Autowired
	TrainerService Trainerservice;
	
	@RequestMapping("/Tlogin")
	public ModelAndView Tlogin() 
	{
		return new ModelAndView("TrainerReg");
	}
	
	@RequestMapping("/trainerlogindone")
	public ModelAndView ValidateAdmin(@RequestParam("uname") String userName,@RequestParam("pass") String password)
	{
			Trainer login=new Trainer(userName,password);
			login=Trainerservice.ValidateTrainer(login);
			if(login==null) 
			{
				return new ModelAndView("TrainerReg");
				
			}
			else
				return new ModelAndView("welcometrainer");	

	}

	
	
	
	@RequestMapping("/Tlogout")
	public ModelAndView Tlogout() 
	{
		return new ModelAndView("TrainerReg");
	}
}
  