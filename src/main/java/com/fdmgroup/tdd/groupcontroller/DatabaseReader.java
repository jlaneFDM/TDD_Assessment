package com.fdmgroup.tdd.groupcontroller;

import java.util.Map;

public class DatabaseReader {
	IReader iread;
	
	public DatabaseReader(IReader iread) {
		this.iread = iread;
	}
	
	public Map<String, Trainee> readGroup(Map<String, Trainee> map) {
		iread.readTrainee();
		return null;
	}
}
