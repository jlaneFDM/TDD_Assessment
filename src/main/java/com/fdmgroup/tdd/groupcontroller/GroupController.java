package com.fdmgroup.tdd.groupcontroller;

import java.util.HashMap;
import java.util.Map;

import org.mockito.Mockito;

public class GroupController implements GroupControllerService {
    IReader iread;
    DatabaseReader dbReader;
    DatabaseWriter dbWriter;
	public GroupController(IReader iread) {
		this.iread = iread;
	}
	@Override
	public Map<String, Trainee> getAllTrainees() {
		
		this.dbReader = new DatabaseReader(iread);
		Trainee t = Mockito.mock(Trainee.class);
		Map<String, Trainee> m = new HashMap<String, Trainee>();
		m.put("123", t);
		dbReader.readGroup(m);
		
		return null;
	}

	@Override
	public void addTrainee(Trainee trainee) {
		
		
	}

	@Override
	public void removeTraineeByUsername(String traineeUsername) {
		// TODO Auto-generated method stub
		
	}

}
