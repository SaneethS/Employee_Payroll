package com.employeepayroll;

public class EmployeePayroll {
	private int empId;
	private String name;
	private double salary;
	
	public EmployeePayroll(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "EmployeePayroll [empId=" + empId + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}
