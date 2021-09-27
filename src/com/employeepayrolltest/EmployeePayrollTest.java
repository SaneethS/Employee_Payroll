package com.employeepayrolltest;

import java.io.IOException;
import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

import com.employeepayroll.EmployeePayroll;
import com.employeepayroll.EmployeePayrollService;


public class EmployeePayrollTest {
	
	@Test
	public void givenEmployeeWhenWrittenShouldMatchEmployeeEntries() throws IOException{
		EmployeePayroll[] array = {
			new EmployeePayroll(101, "Bob", 36000),
			new EmployeePayroll(232, "Kevin", 45000),
			new EmployeePayroll(312, "Vincent", 24000),
			new EmployeePayroll(445, "Madara" , 60000)
		};
		
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(Arrays.asList(array));
		employeePayrollService.writeEmployeePayrollToFile();
		long entryCount = employeePayrollService.countLines();
		Assert.assertEquals(4, entryCount);
	}
}
