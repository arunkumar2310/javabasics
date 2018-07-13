package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class FirstJDBC {
	Connection connection =null;
	Statement statement=null;
	ResultSet resultSet=null;
	
	public FirstJDBC(){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");    //loads driver for mysql and creates class object
			connection = DriverManager
					.getConnection("jdbc:mysql://localhost/mydatabase","root","");//driverManager loads jdbc:DBproduct name://ip address:host/DBname,password
			System.out.println(connection);
			statement=connection.createStatement();		//loads statement for the connected database
			String sql="select * from employee";		//loads cursor of result area in string sql
			resultSet=statement.executeQuery(sql);		//calls cursor and automatically type casted into resultSet for java and returned
			System.out.println(statement);
			System.out.println(resultSet);
			while(resultSet.next()) {
				System.out.println("Empid:"+resultSet.getString("empid")+" ");
				System.out.println("Name:"+resultSet.getString("name")+" ");
				System.out.println("Age:"+resultSet.getString(3)+" ");
				System.out.println("Slaray:"+resultSet.getString("salary")+"\n ");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
		try {
			if(connection!=null) {
				connection.close();
			}
			if(resultSet!=null) {
				resultSet.close();
			}
			if(statement!=null) {
				statement.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	public static void main(String[] args) {
		FirstJDBC first = new FirstJDBC();
	}

}
