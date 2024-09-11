package com.jsp.test;

import com.jsp.demo.Employee;
import com.jsp.demo.EmployeeTest;

public class UpdateController {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.setId(19);
		e.setName("Chotu");
		e.setSal(12000);
		e.setAdress("MUMBAI");
		e.setEmail("choto@gmail.com");
		EmployeeTest et=new EmployeeTest();
		int r=et.updateTable(e);
		if(r>0) {
			System.out.println("Updation Sucessfull...");
		} else {
			System.out.println("Please check the code.");
		}
		
	}

}
