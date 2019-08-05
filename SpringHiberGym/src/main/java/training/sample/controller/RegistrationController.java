package training.sample.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.sample.model.Member;
import training.sample.service.RegistrationService;
@Controller
public class RegistrationController {

	@Autowired 
	RegistrationService Registrationservice;
	@RequestMapping("/Registration")
	public ModelAndView viewgrpo()
	{
	   return new ModelAndView("Registration");
	}
	

//	@RequestMapping("/Registration2")
//	public ModelAndView Registration2()
//	{
//	   return new ModelAndView("Registration2");
//	}
	
	 
	 @RequestMapping("/RegistrationDone")
	 public ModelAndView adduser(@RequestParam("first_name") String uname,
	@RequestParam("last_name") String lastname,@RequestParam("gender") String gender,@RequestParam("contact_no") String mobile,
	@RequestParam("email") String email,@RequestParam("add") String address,
	@RequestParam("dob") Date dob,@RequestParam("occupation") String occupation,@RequestParam("user_name") String user_name,
	@RequestParam("user_password") String user_password,@RequestParam("confirm_password") String confirm_password)
	 {
		 Member p=new Member(uname,lastname,gender,mobile,email,address, dob,occupation,user_name,user_password,confirm_password);
		
		 Registrationservice.adduser(p);
	 	return new ModelAndView("Login");
	 }
	 
	 
	 
	 
	 @RequestMapping("/registerAgain")
		public ModelAndView registerAgain()
		{
		   return new ModelAndView("registerAgain");
		}
	 
//	 @RequestMapping("/healthissuse")
//	 public ModelAndView adduser(@RequestParam("a") String uname,
//	@RequestParam("b") String lastname,@RequestParam("c") String gender,@RequestParam("d") String mobile,
//	@RequestParam("e") String email,@RequestParam("f") String address,
//	@RequestParam("g") Date dob,@RequestParam("h") String occupation,@RequestParam("i") String user_name,
//	@RequestParam("j") String user_password,@RequestParam("k") String confirm_password,
//	@RequestParam("l") String confirm_password,@RequestParam("m") String confirm_password,
//	@RequestParam("n") String confirm_password,
//	@RequestParam("q") String confirm_password,@RequestParam("r") String confirm_password,
//	@RequestParam("s") String confirm_password,@RequestParam("t") String confirm_password,
//	@RequestParam("u") String confirm_password,@RequestParam("v") String confirm_password
//	,@RequestParam("w") String confirm_password,@RequestParam("x") String confirm_password)
//	 {
//		 Member p=new Member(uname,lastname,gender,mobile,email,address, dob,occupation,user_name,user_password,confirm_password);
//		
//		 Registrationservice.adduser(p);
//	 	return new ModelAndView("Login");
//	 }
	 
}


