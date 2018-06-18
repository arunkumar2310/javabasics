package com.prp;

public class Divisible_2_3_5 {
	public static void main(String args[]) {
		int j=0;
		for(int i=0;j<5;i++) {
			if(i%2==0 && i%3==0 && i%5==0) {
				System.out.println(i);
				j++;
			}
		}
	}
}
