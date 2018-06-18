package com.prp;
import java.util.Scanner;

public class Calculator {
	public static void main(String args[]) {
		String cont;
		int result=0;
		Scanner scan=new Scanner(System.in);
		do {
		System.out.println("1.Add\n2.Sub\nEnter 1 or 2");
		int action=scan.nextInt();
		System.out.println("Enter two numbers");
		int input1=scan.nextInt();
		int input2=scan.nextInt();
		if(action==1) {
			result=input1+input2;
		}
		else if(action==2){
			result=input1-input2;
		}
		System.out.println("Result="+result);
		System.out.println("Enter 'y' to continue");
		cont=scan.next();
		}while(cont!="Y" ||cont!="y" );
	}
}
