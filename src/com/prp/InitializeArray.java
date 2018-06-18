package com.prp;

public class InitializeArray {
	public static void main(String args[]) {
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		double average=0;
		for(int i=0;i<array.length;i++) {
			sum=sum+array[i];
		}
		average=(double)sum/array.length;
		System.out.println("Sum of array elements is= "+sum);
		System.out.println("Average of array elements is="+average);
	}
}
