package com.employeepayroll;

import java.util.List;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

/**
 * class used to check all employee payroll service
 * @author saneeths
 *
 */
public class EmployeePayrollService {
	private List<EmployeePayroll> list;

	public EmployeePayrollService(List<EmployeePayroll> list) {
		this.list = list;
	}
	
	/**
	 * method used to read employee payroll
	 * @param scanner
	 */
	public void readEmployeePayroll(Scanner scanner) {
		System.out.println("Enter employee id:");
		int id = scanner.nextInt();
		System.out.println("Enter employee name:");
		scanner.nextLine();
		String name = scanner.nextLine();
		System.out.println("Enter employee salary");
		double salary = scanner.nextDouble();
		list.add(new EmployeePayroll(id,name,salary));
	}
	
	/**
	 * method used to write the employee payroll
	 */
	public void writeEmployeePayroll() {
		System.out.println("Employee Payroll: "+list);
	}
}
