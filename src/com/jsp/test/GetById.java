package com.jsp.test;

import com.jsp.demo.Employee;
import com.jsp.demo.EmployeeTest;

public class GetById {

	public static void main(String[] args) {
		EmployeeTest et=new EmployeeTest();
		Employee e1=et.getById(3);
		if(e1!=null) {
			System.out.println("Employee name is : "+e1.getName());   
			System.out.println("Employee id is : "+e1.getId());   
			System.out.println("Employee salary is : "+e1.getSal());   
			System.out.println("Employee address is : "+e1.getAdress());   
			System.out.println("Employee email is : "+e1.getEmail());   
		}
		else {
			System.out.println("ID is not present.");
		}
	}

}
