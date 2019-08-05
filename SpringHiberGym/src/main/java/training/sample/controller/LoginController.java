package training.sample.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.maven.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import training.sample.model.LoginClass;
import training.sample.model.Member;
import training.sample.service.LoginService;

@Controller
public class LoginController {

	@Autowired 
	LoginService Loginservice;
	
	@RequestMapping("/login")
	public ModelAndView viewgrpo()
	{
	   return new ModelAndView("Login");
	}
	
	
//
//	@RequestMapping("/logindone")
//	public ModelAndView insertlog(@RequestParam("user") String user,@RequestParam("pass") String pass)
//	{
//		String msg="";
//		LoginClass log=new LoginClass (user,pass);
//		
//		Loginservice.insertlog(log);
//		/*if(i==1)
//		{
//			msg="record inserted successfully";
//			return new ModelAndView("welcomeUser");
//		}
//		else
//		{
//			 msg="record not inserted";
//			return new ModelAndView("login");
//	
//		}*/
//		return new ModelAndView("login");
//	}
	
@RequestMapping("/logindone")

public ModelAndView ValidateUser(@RequestParam("uname") String userName,@RequestParam("pass") String password)
{
	System.out.println(userName);
	System.out.println(password);
	Member login=new Member(userName,password);
	List<Member> login1=Loginservice.ValidateUser(login);
	if(login1!=null) 
	{
		return new ModelAndView("welcomeuser");
		
	}
	else
		return new ModelAndView("Login");
	
}

@RequestMapping("/Alogout")
public ModelAndView AdminLogin()
{
	return new ModelAndView("Login");
	
}
	
	}

	
