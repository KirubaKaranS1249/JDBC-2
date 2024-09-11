package com.jsp.test;

import java.util.List;

import com.jsp.demo.Employee;
import com.jsp.demo.EmployeeTest;

public class GetByAllController {
public static void main(String[] args) {
	EmployeeTest et=new EmployeeTest();
	List <Employee> li=et.getByAll();
	if(li != null) {
		for(Employee e : li) {
			System.out.println("Employee Name is :"+e.getName());
			System.out.println("Employee Id is :"+e.getId());
			System.out.println("Employee salary is :"+e.getSal());
			System.out.println("Employee adress is :"+e.getAdress());
			System.out.println("Employee email is :"+e.getEmail());
			System.out.println("--------------------------------------------------");
		}
	}
}
}
