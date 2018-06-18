package com.prp;
import java.util.Scanner;

public class Floyd {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=scan.nextInt();
		int i=0,j=1;
		for(int k=0;k<num;k++) {
		for(i=0;i<j;i++) {
			System.out.print("* ");
		}
		if(i==j) {
			System.out.println("\n");
			j++;
		}
		}
	}
}
