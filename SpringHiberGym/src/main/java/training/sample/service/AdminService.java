package training.sample.service;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.sample.dao.AdminDao;
import training.sample.model.Admin;
import training.sample.model.Batches;
import training.sample.model.Member;
import training.sample.model.Package1;
import training.sample.model.Trainer;

@Service
public class AdminService {

	@Autowired
	 AdminDao Admindao;

	public Admin ValidateAdmin(Admin login) {
		return Admindao.ValidateAdmin(login);
	}

	public List<Member> ViewAllMembers() {
		
		return Admindao.ViewAllMembers();
	}

	public List<Trainer> ViewAllTrainers() {
		return Admindao.ViewAllTrainers();
	}

	public int deleteMembers(int member_id) 
	{
		return Admindao.deleteMembers(member_id);
	}

	public List<Member> getById(int member_id) {
		return Admindao.getById(member_id);
		
	}

	public Member UpdateMembers(Member c) {
		return Admindao.UpdateMembers(c);
	}

	public Batches addbaches(Batches b) {
		return Admindao.addbaches(b);
		
	}

	public Package1 addpackages(Package1 b1) {
		return Admindao.addpackages(b1);
		
		
	}

	public List<Package> viewAlltodeletepackages() {
		return Admindao.viewAlltodeletepackages();
	}
}
