package com.prp;
import java.util.Scanner;

public class Reverse {
	public static void main(String args[]) {
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		for(int i=0;num>0;i++) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
