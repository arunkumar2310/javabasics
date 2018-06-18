package com.worksheet_answers;

public class SumBetween {
	public static void main(String args[]) {
		int a[]= {1,2,3,6,5,4,7,6,5};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==6) {
				for(;i!=7;i++){
				 continue;
				}
			}
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}
