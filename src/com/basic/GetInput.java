package com.basic;
import java.util.Scanner;

public class GetInput {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		System.out.println("Enter your number");
		int num=scan.nextInt();
		System.out.println("enter your CGPA");
	    double mark=scan.nextDouble();
	    System.out.println("My details \nName:"+name+"\nNumber:"+num+"\nmarks:"+mark);
	}
}
