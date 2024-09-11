package com.jsp.test;

import com.jsp.demo.Employee;
import com.jsp.demo.EmployeeTest;

public class InsertContrller {

	public static void main(String[] args) {
		Employee e=new Employee(); // here name,id,sal,adress should be in order
		e.setName("lucky");
		e.setId(19);
		e.setSal(40000.0);
		e.setAdress("HYD");
		e.setEmail("luck@gmail.com");
		EmployeeTest et=new EmployeeTest();
		int res=et.insertTable(e);
		if(res > 0) {
			System.out.println("Insertion is sucessful...");
		} else {
			System.out.println("Please check the code.");
		}
	}

}
