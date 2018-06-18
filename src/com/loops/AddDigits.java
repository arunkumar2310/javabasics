package com.loops;

public class AddDigits {
	public static void main(String args[]) {
		int input=1234,sum=0,rem=0;
		for(int i=0;input!=0;i++) {
			rem=input%10;
			input=input/10;
			sum=sum+rem;
		}
		System.out.println(sum);
	}
}
