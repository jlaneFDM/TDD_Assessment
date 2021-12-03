package com.fdmgroup.tdd.groupcontroller;

public class DatabaseWriter {
	IReader iread; //not a good variable name
	public DatabaseWriter(IReader iread) {
		this.iread = iread;
	}
	public void addTrainee(Trainee any) {
		iread.addTrainee(any);
		
	}

	public void deleteTraineeByUsername(String anyString) {
		iread.deleteTrainee(anyString);
		
	}
	
}
