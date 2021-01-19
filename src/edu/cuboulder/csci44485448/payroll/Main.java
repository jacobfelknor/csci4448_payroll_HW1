package edu.cuboulder.csci44485448.payroll;

import java.util.ArrayList;
import java.util.List;

/*
	Jacob Felknor
	CSCI 4448
 */

public class Main {
	
	private static List<Employee> employees = new ArrayList<Employee>();
	
	private static void addEmployees() {
		employees.add(new Employee("John Smith", 200));
		employees.add(new Employee("Joe Doe", 300));
		employees.add(new HourlyEmployee("Mary Smith", 15, 10));
		employees.add(new CommissionEmployee("Jacob Felknor", 1000000, .1));
	}

	public static void main(String[] args) {
		addEmployees();
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}

}
