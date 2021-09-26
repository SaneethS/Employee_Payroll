package com.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<EmployeePayroll> list = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(list);
		Scanner scanner = new Scanner(System.in);
		employeePayrollService.readEmployeePayroll(scanner);
		employeePayrollService.writeEmployeePayroll();
		scanner.close();
	}
}
