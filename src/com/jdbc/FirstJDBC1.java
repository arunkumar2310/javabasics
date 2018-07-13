package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBC1 {
	
	public FirstJDBC1(){
		
	}
	public void select(){
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "select * from employee";
			resultSet = statement.executeQuery(sql);
			System.out.println(statement);
			System.out.println(resultSet);
			while(resultSet.next()){
				System.out.print(resultSet.getString("empid")+" ");
				System.out.print(resultSet.getString("name")+" ");
				System.out.print(resultSet.getString(3)+" ");
				System.out.print(resultSet.getString("salary")+"\n");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	
	public void update(){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "update employee set age=40 where empid = 1";
			int ret = statement.executeUpdate(sql);//returns integer value of number of coulumns affected
			System.out.println(ret);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void delete(){
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "delete from employee where empid=1";
			int ret = statement.executeUpdate(sql);//returns integer value of number of coulumns affected
			System.out.println(ret);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void dbMetadata(){
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println(connection);
			DatabaseMetaData  dbMetaData = connection.getMetaData();//environmental details of database
			System.out.println(dbMetaData.getDatabaseProductName());//extracts product name
			System.out.println(dbMetaData.getDatabaseProductVersion());//extracts version
			System.out.println(dbMetaData.getDatabaseMajorVersion());
			System.out.println(dbMetaData.getDatabaseMinorVersion());
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void resultsetMetaData(){
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println(connection);
			statement = connection.createStatement();
			String sql = "select * from employee";
			resultSet = statement.executeQuery(sql);
			System.out.println(statement);
			System.out.println(resultSet);
			ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
			System.out.println(resultSetMetaData.getColumnCount());
			while(resultSet.next()){
				System.out.print(resultSet.getString("empid")+resultSetMetaData.getColumnName(1)+resultSetMetaData.getColumnType(1)+"   ");
				System.out.print(resultSet.getString("name")+resultSetMetaData.getColumnName(2)+resultSetMetaData.getColumnType(2)+"   ");
				System.out.print(resultSet.getString(3)+resultSetMetaData.getColumnName(3)+resultSetMetaData.getColumnType(3)+"   ");
				System.out.print(resultSet.getString("salary")+resultSetMetaData.getColumnName(4)+resultSetMetaData.getColumnType(4)+"\n");
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(resultSet != null)
					resultSet.close();
				if(statement != null)
					statement.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void preparedStatementExample(){
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println(connection);
			String sql = "insert into employee(name,age,salary) values (?,?,?)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, "Arun6");
			preparedStatement.setInt(2, 25);
			preparedStatement.setDouble(3, 600000);
			System.out.println(preparedStatement);
			int ret=preparedStatement.executeUpdate();
			System.out.println(ret);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				
				if(preparedStatement != null)
					preparedStatement.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
	public void transactionManagementExample(){
		Connection connection = null;
		PreparedStatement preparedStatementOne = null;
		PreparedStatement preparedStatementTwo = null;
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver"); // load the driver for mysql into JVM
			connection = DriverManager // jdbc:dbproductname://ipaddress:port/dbname
					.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","");
			System.out.println(connection);
			connection.setAutoCommit(false);
			String sql = "update employee set name=?,salary=?,empid=? where empid=?";
			preparedStatementOne = connection.prepareStatement(sql);
			preparedStatementOne.setString(1, "Arun7");
			preparedStatementOne.setDouble(2, 700000);
			preparedStatementOne.setInt(3, 7);
			preparedStatementOne.setInt(4, 36);
			System.out.println(preparedStatementOne);
			int ret=preparedStatementOne.executeUpdate();
			System.out.println(ret);
			
			String sql1 = "update employee set name=?,salary=? where empid=?";
			preparedStatementTwo = connection.prepareStatement(sql1);
			preparedStatementTwo.setString(1, "Arun6");
			preparedStatementTwo.setDouble(2, 600000);//if error occurs in 2nd unit,the entire transaction should be rolled back
			preparedStatementTwo.setInt(3, 6);			//this is done in catch back by rollback
			System.out.println(preparedStatementTwo);
			int ret1=preparedStatementTwo.executeUpdate();
			System.out.println(ret1);
			connection.commit();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			e.printStackTrace();
		}finally {
			try {
				
				if(preparedStatementOne != null)
					preparedStatementOne.close();
				if(preparedStatementTwo != null)
					preparedStatementTwo.close();
				if(connection != null)
					connection.close();
			} catch (Exception e2) {
				
				e2.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		FirstJDBC1 first = new FirstJDBC1();
		//first.update();
		//first.delete();
		//first.dbMetadata();
		//first.resultsetMetaData();
		/*first.preparedStatementExample();*/
		first.transactionManagementExample();
	}

}

