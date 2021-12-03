package com.fdmgroup.tdd.groupcontroller;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GroupController implements GroupControllerService {
    IReader iread; //I'd change this interface name. 
    DatabaseReader dbReader;
    DatabaseWriter dbWriter;
	public GroupController(IReader iread) {
		this.iread = iread;
	}
	@Override
	public Map<String, Trainee> getAllTrainees() {
		
		this.dbReader = new DatabaseReader(iread);
		Map<String, Trainee> test = new HashMap<String,Trainee>();
		dbReader.readGroup(test);
		
		return null;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		this.dbWriter = new DatabaseWriter(iread);
		dbWriter.addTrainee(trainee);
				
	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		this.dbWriter = new DatabaseWriter(iread);
		dbWriter.deleteTraineeByUsername(traineeUsername);
	}

}
