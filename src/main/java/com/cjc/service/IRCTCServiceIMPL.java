package com.cjc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.model.TrainInfo;
import com.cjc.repository.TrainRepository;

@Service
public class IRCTCServiceIMPL implements IRCTCService{

	@Autowired	
	private TrainRepository repo;
	@Override
	public TrainInfo saveTrainInfo(TrainInfo trainInfo) {
		
		return repo.save(trainInfo);
	}

	@Override
	public TrainInfo getTrainInfo(int trainNum) {
		
		if(repo.existsById(trainNum))
		{
			return repo.findById(trainNum).get();
		}
		else
		return null;
	}
	@Override
	public TrainInfo deleteTrain(int trainNum) {
		
		if(repo.existsById(trainNum))
		{
			TrainInfo info = repo.findById(trainNum).get();
			repo.deleteById(trainNum);
			return info;
		}
		return new TrainInfo();
	}
	@Override
	public TrainInfo updateTrainInfo(TrainInfo trainInfo) {
		
		return repo.save(trainInfo);
	}


}
