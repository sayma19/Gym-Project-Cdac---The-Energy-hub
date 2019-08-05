package training.sample.dao;

import java.util.List;
import java.util.Scanner;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import training.sample.model.Admin;
import training.sample.model.Batches;
import training.sample.model.Member;
import training.sample.model.Package1;
import training.sample.model.Trainer;

@Repository
public class AdminDao {
	@Autowired
	SessionFactory sf;
	Scanner sc=new Scanner(System.in);
	
	
	 public Admin ValidateAdmin(Admin login) {
		 System.out.println(login.getUserName());
		 System.out.println(login.getPassword());
			Session session=sf.openSession();
			Query query=session.createQuery("from Admin where UserName=:uname and Password=:pass");
			query.setParameter("uname",login.getUserName());
			query.setParameter("pass",login.getPassword());

			List<Admin> list= query.list();
			System.out.println(list);
			for(Admin l:list)
			{
				if(l.getPassword().equals(login.getPassword()) && l.getUserName().equals(login.getUserName()))
				{
				  return list.get(0);
				}
				
			}
			return null;
		
		}
	 
	
		public List<Member> ViewAllMembers() {
			Session session=sf.openSession();
			Query query=session.createQuery("from Member");
			
			System.out.println(query);
			return query.list();
		}


		public List<Trainer> ViewAllTrainers() {
			Session session=sf.openSession();
			Query query=session.createQuery("from Trainer");
			
			System.out.println(query);
			return query.list();
		}


			public int deleteMembers(int member_id)  {
				System.out.println(member_id);
				Session s=sf.openSession();
				Transaction t=(Transaction) s.beginTransaction();
				Query query=s.createQuery("delete from Member where Member_id="+member_id);
				System.out.println(member_id);
				///query.setParameter("member_id",member_id);
				  int rowCount = query.executeUpdate();
				  System.out.println("Rows affected: " + rowCount);
				  System.out.println(member_id);
				  t.commit();
				 s.close();
				  return rowCount;
				 		
			
			}
	    

		public List<Member> getById(int member_id) {
			Session session=sf.openSession();
			Transaction t=(Transaction) session.beginTransaction();
			Query query=session.createQuery("from Member where Member_id=:member_id");
			query.setParameter("member_id",member_id);
			t.commit();
//			session.close();
			System.out.println(query);
			List<Member> clist= query.list();
		
			for(Member l:clist)
			{ return clist;
				
			}
			return null;
		
		
		}
		
		

//
//		public Member UpdateMembers(Member c) {
//			
//			Session session=sf.openSession();
//			Transaction t=(Transaction) session.beginTransaction();
//			Query query=session.createQuery("Update Member where Member_id=:member_id");
//			query.setParameter("member_id",c.getMember_id());
//			System.out.println(query);
//			List<Member> clist= query.list();
//			return  clist.get(0);
//		}
		public Member UpdateMembers(Member c)
		{
		     
		        // Get session from Sesson factory
		        Session session = sf.openSession();
		        Query query = session.createQuery("update Member set Mobile=:mobile where Member_id=:member_id");
		        query.setParameter("mobile", c.getMobile());
		        query.setParameter("member_id",c.getMember_id() );
		        // Begin transaction
		        Transaction t = session.beginTransaction();
		        int result = query.executeUpdate();
		        // Commit the transaction and close the session
		        t.commit();
		        System.out.println("No of rows updated: "+result);
		       
		        session.close();
				return c;
		
		}


		public Batches addbaches(Batches b) {
			
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
			s.save(b);
			tx.commit();
			s.close();
			return b;
			
		}


		public Package1 addpackages(Package1 b1) {
			
			Session s=sf.openSession();
			Transaction tx=s.beginTransaction();
			s.save(b1);
			tx.commit();
			s.close();
			return b1;
		}


		public List<Package> viewAlltodeletepackages() {
			
			Session session=sf.openSession();
			Query query=session.createQuery("from Package");
			
			System.out.println(query);
			return query.list();
		}
		
}


