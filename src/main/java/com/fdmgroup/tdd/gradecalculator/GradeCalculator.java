package com.fdmgroup.tdd.gradecalculator;

public class GradeCalculator implements GradeCalculatorService {

	
	@Override
	public String getClassification(double mark) {
		double seventyFive = 75.0;
		double eighty = 80.0;
		double ninety = 90.0;
		double oneHundred = 100.00;
		String fail = "fail";
		String pass = "pass";
		String merit = "merit";
		String distinction = "distinction";
		
		
		if (mark < seventyFive) {
			return fail;
		}else if (mark >= seventyFive && mark < eighty) {
			return pass;
		}else if (mark >= eighty && mark < ninety) {
			return merit;
		}else if (mark >= ninety && mark <= oneHundred) {
			return distinction;
		}
				
		return null;
	}

}
