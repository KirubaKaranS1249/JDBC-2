package com.jsp.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;

public class EmployeeTest {
	public void createTable() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root");
				Statement s=conn.createStatement();
				s.execute("create table Employee(name varchar (10) not null, id int primary key ,salary double not null,address varchar(10),email varchar(20) not null)");
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	


public int insertTable(Employee e) {
	try {
		DriverManager.registerDriver(new Driver());  // import 'Driver' (com.mysql.cj.jdbc)
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root");
		PreparedStatement ps=conn.prepareStatement("insert into Employee values(?,?,?,?,?)");   // place holders are holding place for values and represent with? //PreparedStatement.mysql
		ps.setString(1,e.getName());
		ps.setInt(2,e.getId());
		ps.setDouble(3,e.getSal());
		ps.setString(4, e.getAdress());
		ps.setString(5, e.getEmail());
		
		int res=ps.executeUpdate();
		return res;
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
	return 0;
}
public int updateTable(Employee emp) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root");
			PreparedStatement ps=c.prepareStatement("update Employee set name=?,salary=?,address=?,email=? WHERE id=?");
			ps.setString(1, emp.getName());  // here name,id,sal,adress should be in not in order means also ok
			ps.setDouble(2,emp.getSal());
			ps.setString(3, emp.getAdress());
			ps.setString(4, emp.getEmail());
			ps.setInt(5, emp.getId());
			
		int res=ps.executeUpdate();
		return res;
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
}
public int deleteTable(Employee emp) {
	try {
		DriverManager.registerDriver(new Driver());
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root");
		PreparedStatement ps=c.prepareStatement("delete from employee where id=?");
		ps.setInt(1,emp.getId());
		int res=ps.executeUpdate();
		return res;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return 0;
	
}
public Employee getById(int id) {
	Employee e=new Employee();
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		try {
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from Employee where id=3");
			while(rs.next()) {
				e.setId(rs.getInt("id"));
				e.setName(rs.getString("name"));
				e.setSal(rs.getDouble("salary"));
				e.setAdress(rs.getString("address"));
				e.setEmail(rs.getString("email"));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	} catch (ClassNotFoundException e2) {
		// TODO Auto-generated catch block
		e2.printStackTrace();
	}
	return e;
	
}
public List<Employee> getByAll(){
	List<Employee> li=new ArrayList<Employee>();
	try {
		DriverManager.registerDriver(new Driver());
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_crud","root","root");  //connection = interface
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employee");
		while(rs.next()){
			Employee e=new Employee();
			e.setName(rs.getString("name"));
			e.setId(rs.getInt("id"));
			e.setSal(rs.getDouble("salary"));
			e.setAdress(rs.getString("address"));
			e.setEmail(rs.getString("email"));
			li.add(e);
		}
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return li;
	
}
}
