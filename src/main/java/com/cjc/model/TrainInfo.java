package com.cjc.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TrainInfo {
	
	
	@Id
	private int trainNum;
	private String trainName;
	private String source;
	private String destination;
	private String currentStation;
	public int getTrainNum() {
		return trainNum;
	}
	public void setTrainNum(int trainNum) {
		this.trainNum = trainNum;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getCurrentStation() {
		return currentStation;
	}
	public void setCurrentStation(String currentStation) {
		this.currentStation = currentStation;
	}
	public TrainInfo(int trainNum, String trainName, String source, String destination, String currentStation) {
		super();
		this.trainNum = trainNum;
		this.trainName = trainName;
		this.source = source;
		this.destination = destination;
		this.currentStation = currentStation;
	}
	public TrainInfo() {
		
	}
	
	
	
	
	

}
