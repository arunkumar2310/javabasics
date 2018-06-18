package com.loops;
import java.util.Scanner;

public class IfLoop1 {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int input=scan.nextInt();
		if(input>0) {
			System.out.println("The number is positive");
		}
		else if(input<0) {
			System.out.println("The number is negative");
		}
		else {
			System.out.println("The number is zero");
		}
		
	}
}
