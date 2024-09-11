package com.jsp.test;

import com.jsp.demo.EmployeeTest;

public class CreateController {
	public static void main(String[] args) {
		EmployeeTest e=new EmployeeTest();
		e.createTable();
		System.out.println("Table is created sucessfully...");
	}
}
