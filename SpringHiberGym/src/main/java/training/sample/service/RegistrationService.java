package training.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.sample.dao.RegistrationDao;
import training.sample.model.Member;

@Service
public class RegistrationService {

	@Autowired 
	RegistrationDao Registrationdao;
	public void adduser(Member p) {
		
			 Registrationdao.adduser(p);
			
		}
		
	}
