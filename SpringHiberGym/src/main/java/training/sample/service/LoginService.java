package training.sample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import training.sample.dao.LoginDao;
import training.sample.model.LoginClass;
import training.sample.model.Member;

@Service
public class LoginService {

	@Autowired
	LoginDao Logindao;
	public void insertlog(LoginClass log) {
		
		 Logindao.insertlog(log);
	}
	



	public List<Member> ValidateUser(Member login)
	{
		return Logindao.ValidateUser(login);
	}
}