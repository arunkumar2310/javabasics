package com.worksheet_answers;

public class Employee {
	private String firstName;
	private String lastName;
	private double salary;
	public String setFirstName(String firstname)
	{
		this.firstName=firstname;
		return firstName;
	}
	public String setLastName(String lastname)
	{
		this.lastName=lastname;
		return lastName;
	}
	public double setSalary(double salary)
	{
		this.salary=salary;
		return salary;
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public double getSalary()
	{
		return salary;
	}

public static void main(String[] args)
{
	Employee p1=new Employee();
	Employee p2=new Employee();
	String firstName1=p1.setFirstName("Arun");
	String lastName1=p1.setLastName("Kumar");
	String firstName2=p2.setFirstName("Dickman");
	String lastName2=p2.setLastName("Pious");
	double salary1=p1.setSalary(2000000);
	double salary2=p2.setSalary(2000000);
	System.out.println("Name of Employee_1:"+firstName1+" "+lastName1+"\n"+"Salary/annum:Rs."+salary1);
	System.out.println("Name of Employee_2:"+firstName2+" "+lastName2+"\n"+"Salary/annum:Rs."+salary2);
    salary1=salary1*1.1;
    salary2=salary2*1.1;
    p1.setSalary(salary1);
    p2.setSalary(salary2);
    System.out.println("After increment of 10%"); 
    System.out.println("Name of Employee_1:"+firstName1+" "+lastName1+"\n"+"Salary/annum:Rs."+salary1);
	System.out.println("Name of Employee_2:"+firstName2+" "+lastName2+"\n"+"Salary/annum:Rs."+salary2);
}
}