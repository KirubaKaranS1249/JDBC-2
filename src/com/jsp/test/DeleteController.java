package com.jsp.test;

import com.jsp.demo.Employee;
import com.jsp.demo.EmployeeTest;

public class DeleteController {
public static void main(String[] args) {
	Employee e=new Employee();
	e.setId(123);
	EmployeeTest et=new EmployeeTest();
	int i=et.deleteTable(e);
	if(i>0) {
		System.out.println("Deletion Sucessfull...");
	} else {
		System.out.println("Please check the code.");
	}
}
}
