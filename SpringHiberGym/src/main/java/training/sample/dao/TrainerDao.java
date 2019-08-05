package training.sample.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import training.sample.model.Member;
import training.sample.model.Trainer;


@Repository
public class TrainerDao {

	
	@Autowired
	SessionFactory sf;
	Scanner sc=new Scanner(System.in);
	
	
	public Trainer ValidateTrainer(Trainer login) {
		
		Session session=sf.openSession();
		Query query=session.createQuery("from Trainer where UserName=:uname and Password=:pass");
		query.setParameter("uname",login.getUserName());
		query.setParameter("pass",login.getPassword());

		List<Trainer> list= query.list();
		System.out.println(list);
		for(Trainer l:list)
		{
			if(l.getPassword().equals(login.getPassword()) && l.getUserName().equals(login.getUserName()))
			{
			  return list.get(0);
			}
			
		}
		return null;
	
	}
	}
