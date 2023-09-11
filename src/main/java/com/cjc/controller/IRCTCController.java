package com.cjc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.model.TrainInfo;
import com.cjc.service.IRCTCService;

@RestController
@RequestMapping("irctc-service")
public class IRCTCController {
	
	
	@Autowired
	private IRCTCService service1;
	@GetMapping("/")
	public String greet()
	{
		return "Welcome to IRCTC App";
	}
	@PostMapping("/trainInfo")
	public ResponseEntity<TrainInfo> saveTrainInfo(@RequestBody TrainInfo trainInfo)
	{
		return new ResponseEntity<TrainInfo>(service1.saveTrainInfo(trainInfo),HttpStatus.CREATED);
	}
	@GetMapping("/{trainNum}")
	public ResponseEntity<TrainInfo>getTrainInfo(@PathVariable int trainNum)
	{
		return new ResponseEntity<TrainInfo>(service1.getTrainInfo(trainNum),HttpStatus.OK);
	}
	@DeleteMapping("/{trainNum}")
	public ResponseEntity<TrainInfo> deleteTrain(@PathVariable int trainNum)
	{
		return new ResponseEntity<TrainInfo>(service1.deleteTrain(trainNum),HttpStatus.OK);
	}
	@PutMapping("/updateTrain")
	public ResponseEntity<TrainInfo>updateTrainInfo(@RequestBody TrainInfo trainInfo)
	{
		return new ResponseEntity<TrainInfo>(service1.updateTrainInfo(trainInfo),HttpStatus.OK);
	}


}
