package com.employeepayroll;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.VoiceStatus;

/**
 * class used to check all employee payroll service
 * @author saneeths
 *
 */
public class EmployeePayrollService {
	public List<EmployeePayroll> list;
	public static String inputFileName = "data/payroll.txt";

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
	
	/**
	 * method to write into new file
	 */
	public void writeEmployeePayrollToFile() {
		StringBuffer buffer = new StringBuffer();
		list.forEach(employee->{
			String employeeDataString = employee.toString().concat("\n");
			buffer.append(employeeDataString); 
		});
		try {
			Files.write(Paths.get(inputFileName), buffer.toString().getBytes());
		}catch( IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * methid to count number of lines in a given file
	 * @return
	 */
	public long countLines() {
		long entries = 0;
		try {
			entries = Files.lines(new File(inputFileName).toPath()).count();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(entries);
		return entries;
	}
}
