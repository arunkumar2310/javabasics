package com.prp;
import java.util.Scanner;

public class FindElement {
	public static void main(String args[]) {
		int array[]= {10,11,12,13,14,15,16,17,18,19,20,21};
		System.out.println("enter the element to be searched");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]==num) {
				System.out.println(i+1);
				break;
			}
			else {
				count++;
			}
		}
		if(count==array.length) {
			System.out.println(-1);
		}
	}
}
