package training.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import training.sample.dao.TrainerDao;
import training.sample.model.Member;
import training.sample.model.Trainer;

@Service
public class TrainerService {


	@Autowired
	TrainerDao Trainerdao;


	public Trainer ValidateTrainer(Trainer login) {
	
			return Trainerdao.ValidateTrainer(login);
		}
	}
	