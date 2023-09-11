package com.cjc.service;

import com.cjc.model.TrainInfo;

public interface IRCTCService {

	TrainInfo saveTrainInfo(TrainInfo trainInfo);

	TrainInfo getTrainInfo(int trainNum);

	TrainInfo deleteTrain(int trainNum);

	TrainInfo updateTrainInfo(TrainInfo trainInfo);

}
