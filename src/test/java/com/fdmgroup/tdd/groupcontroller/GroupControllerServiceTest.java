package com.fdmgroup.tdd.groupcontroller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GroupControllerServiceTest {
	
	//You need a class which implements GroupControllerService
	//and verify that getAllTrainees call readAll of databaseReader
	@Test
	public void test_getAllTraineesCallsreadAllOfDatabaseReader() {
		IReader iread =  Mockito.mock(IReader.class);
		GroupController gc = new GroupController(iread);
		
		gc.getAllTrainees();
		
		Mockito.verify(iread, Mockito.times(1)).readTrainee();
			
	}
	@Test
	public void test_DatabaseWriterObjectCalledFromGroupControllerToDeleteUserByUserName() {
		IReader iread =  Mockito.mock(IReader.class);
		GroupController gc = new GroupController(iread);
		
		String userName = "Bob";
		gc.removeTraineeByUsername(userName);
		
		Mockito.verify(iread, Mockito.times(1)).deleteTrainee(userName);
	}
	@Test
	public void test_DatabaseWriterObjectCalledFromGroupControllerToWriteATraineeToDB() {
		IReader iread =  Mockito.mock(IReader.class);
		GroupController gc = new GroupController(iread);
		
		Trainee t = Mockito.mock(Trainee.class);
		gc.addTrainee(t);
		
		Mockito.verify(iread, Mockito.times(1)).addTrainee(t);
		
	}
}
