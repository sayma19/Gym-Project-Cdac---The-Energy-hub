package training.sample.dao;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import training.sample.model.Member;

@Repository
public class RegistrationDao {
	
	@Autowired
	SessionFactory sf;
	Scanner sc=new Scanner(System.in);
	

	public void adduser(Member p) {
		
		
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		s.save(p);
		tx.commit();
		s.close();
		
	}
	}
