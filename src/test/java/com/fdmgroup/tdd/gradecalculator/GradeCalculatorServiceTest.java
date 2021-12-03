package com.fdmgroup.tdd.gradecalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

public class GradeCalculatorServiceTest {
	
	@Test
	public void test_GradeCalculatorReturnsFailWhenResultLessThanSeventyFive(){
		
		double failingGrade = 74.0;
		GradeCalculator gc = new GradeCalculator();
		String message = "fail";
		
		String result = gc.getClassification(failingGrade);
		
		assertEquals(message, result);
				
	}
	
	@Test
	public void test_GradeCalculatorReturnsPassWhenResultGreaterThanSeventyFiveButLessThanEighty() 
	{
		double passingGrade = 76.0;
		GradeCalculator gc = new GradeCalculator();
		String message = "pass";
		
		String result = gc.getClassification(passingGrade);
		
		assertEquals(message, result);
				
	}
	
	@Test 
	public void test_GradeCalculatorReturnsMeritWhenResultGreaterThanOrEqualTo80ButLessThan90() {
		double meritoriousGrade = 81.0;
		GradeCalculator gc = new GradeCalculator();
		String message = "merit";
		
		String result = gc.getClassification(meritoriousGrade);
		
		assertEquals(message, result);
		
	}
	@Test
	public void test_GradeCalculatorReturnsDistinctionWhenResultGreaterThanOrEqualToNinetyButLessThanOrEqualToOneHundred() {
		
		double distinctionGrade = 90.0;
		GradeCalculator gc = new GradeCalculator();
		String message = "distinction";
		
		String result = gc.getClassification(distinctionGrade);
		
		assertEquals(message, result);
		
	}
	

}
