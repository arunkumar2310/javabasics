package com.prp;
import java.util.Scanner;

public class Palindrome {
	public static void main(String args[]) {
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int temp=num;
		for(int i=0;num>0;i++) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(sum==temp) {
			System.out.println("The number is palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}
	}
}
