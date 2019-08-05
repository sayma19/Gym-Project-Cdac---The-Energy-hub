package training.sample.controller;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import training.sample.model.*;
import training.sample.model.Admin;
import training.sample.model.Batches;
import training.sample.model.Member;
import training.sample.model.Trainer;
import training.sample.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService Adminservice;
	
	@RequestMapping("/Alogin")
	public ModelAndView AdminLogin()
	{
		return new ModelAndView("AdminLogin");
		
	}
	
	@RequestMapping("/logout")
	public ModelAndView Adminlogout()
	{
		return new ModelAndView("AdminLogin");
		
	}
	
	
	@RequestMapping("/AloginDone")
	
	public ModelAndView ValidateAdmin(@RequestParam("uname") String userName,@RequestParam("pass") String password)
	{
		
		Admin login=new Admin(userName,password);
		Admin login1=Adminservice.ValidateAdmin(login);
		if(login1!=null) 
		{
			
			return new ModelAndView("welcomeadmin");	
		}
		else
			return new ModelAndView("welcomeadmin");
			
}
	 @RequestMapping("/ViewAllMemebrs")
	 public ModelAndView ViewAllMembers()
	 {
		   List<Member> List=Adminservice.ViewAllMembers();
			
		   return new ModelAndView("getAllMembers","List",List);
		
	}
	 
	 @RequestMapping("/ViewAllTrainers")
	 public ModelAndView ViewAllTrainers()
	 {
		   List<Trainer> List=Adminservice.ViewAllTrainers();
			
		   return new ModelAndView("ViewAllTrainers","List",List);
		
	}
	 
	 @RequestMapping("deleteMembers/{member_id}")
		public ModelAndView deleteMembers(@PathVariable int member_id)
		{
				int i=Adminservice.deleteMembers(member_id);
			 	
				return new ModelAndView("ShowMembersToDelete");
			
		}
	
	 
	 @RequestMapping("editMembers/{member_id}")
		public ModelAndView editMembers(@PathVariable int member_id)
		{
			List<Member> memlist =Adminservice.getById(member_id);
			System.out.println(memlist);
			return new ModelAndView("ShowMembersToEdit","memlist",memlist);
			
			
		}
	 
	 @RequestMapping("/UpdateMembers/{member_id}")
	 public ModelAndView updateCategory(@PathVariable int member_id)
     {
		return null;
//
//         Member c= (List<Member>) new Member(mobile);
//
//		 Member n =Adminservice.UpdateMembers(c);
//		 System.out.println();
//		 
//			return new ModelAndView("ShoUpdated");
		 
	 }
				
	 
	 
		@RequestMapping("/addbatches")
		public ModelAndView addbatches()
		{
			return new ModelAndView("addbatches");
			
		}
		
		
		
		@RequestMapping("/addbatchdone")
		public ModelAndView addbaches(@RequestParam("Time")String Day,@RequestParam("Type")String Time)
		{
	      Batches b=new Batches(Day,Time);
			   Adminservice.addbaches(b);
			 	return new ModelAndView("Login");
		}
		
		
		

		@RequestMapping("/addpackages")
		public ModelAndView addpackages()
		{
			return new ModelAndView("addpackages");
			
		}
		
		
		
		@RequestMapping("/addpackagesdone")
		public ModelAndView addpackages(@RequestParam("PACKAGE")String pack,@RequestParam("AMOUNT")String amt,@RequestParam("DURATION") String dur)
		{
			System.out.println(pack+amt+dur);
	      Package1 b1=new Package1(pack,amt,dur);
			   Adminservice.addpackages(b1);
			 	return new ModelAndView("welcomeadmin");
		}
		
	

			
@RequestMapping("/deletepackages")
public ModelAndView viewAlltodeletepackages()
{
	   List<Package> List=Adminservice.viewAlltodeletepackages();
		
	   return new ModelAndView("deletepackages","List",List);
	
}
}	