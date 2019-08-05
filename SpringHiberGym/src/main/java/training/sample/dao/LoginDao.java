package training.sample.dao;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import training.sample.model.LoginClass;
import training.sample.model.Member;
import training.sample.model.Member_Registration;

@Repository
public class LoginDao {
	

	@Autowired
	SessionFactory sf;
	Scanner sc=new Scanner(System.in);
	
	 public void insertlog(LoginClass log) {
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(log);
		tx.commit();
		s.close();
		
	}
	 
	 public List<Member> ValidateUser(Member login) {
		 
		 System.out.println(login.getUserName());
		 System.out.println(login.getPassword());
		Session session=sf.openSession();
		Query query=session.createQuery("from Member where UserName=:uname and Password=:pass");
		query.setParameter("uname",login.getUserName());
		query.setParameter("pass",login.getPassword());

		List<Member> list= query.list();
		System.out.println(list);
		for(Member l:list)
		{
			if(l.getPassword().equals(login.getPassword()) && l.getUserName().equals(login.getUserName()))
			{
			  return list;
			}
			
		}
		return null;
	
	}
	 
	 
}

	 
//	 public Member checkValidation(String uname, String password)
//		{
//		 
//		   Session session=sf.openSession();
//			Query query=session.createQuery("from Member where UserName=uname and Password=password");
////			query.setParameter("UserName",Member.class);
////			query.setParameter("Password",Member.class);
//			System.out.println(query);
//			List<Member> list= query.list();
//			return list.get(0);
//		}
//}
	 
	 
	 
