package com.bridgelabz.empwageoops;

public class EmployeeWageBuilder {

	final int PRESENT_NUMBER_RANGE = 3;
	final int PRESENT = 1;
	final int PART_TIME = 2;
	final int WAGE_PER_HOUR = 20;
	final int WORKING_HOUR = 8;
	final int MAX_WORKING_DAY = 20;
	final int MAX_WORKING_HOUR = 80;

	public int getWorkingHour(int empPresent) {
		switch (empPresent) {
		case PRESENT:
			return WORKING_HOUR;

		case PART_TIME:
			return WORKING_HOUR / 2;

		}
		return 0;
	}

	public double calculateEmpWage() {
		int totalWorkingHour = 0;
		int day = 0;

		while (day < MAX_WORKING_DAY && (totalWorkingHour + WORKING_HOUR / 2) < MAX_WORKING_HOUR) {
			int isPresent = (int) (Math.random() * PRESENT_NUMBER_RANGE);
			totalWorkingHour = totalWorkingHour + getWorkingHour(isPresent);
			day++;
		}

		double salary = totalWorkingHour * WAGE_PER_HOUR;
		System.out.println("Welcome to Employee Wage Computation Program:");
		System.out
				.println("Employee monthly wage : $" + salary + " USD (total working hour : " + totalWorkingHour + ")");
		System.out.println("Total working day : " + day);
		return salary;
	}

	public static void main(String[] args) {
		EmployeeWageBuilder empWageBuilder = new EmployeeWageBuilder();
		empWageBuilder.calculateEmpWage();
	}
}
