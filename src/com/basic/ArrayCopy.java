package com.basic;

public class ArrayCopy {
public static void main(String Args[]) {
	int a[]= {2,3,4,5,6,7,8,9};
	int b[]=new int[5];
	System.arraycopy(a, 3, b, 0, 5);
	for(int i=0;i<5;i++) {
		System.out.println(b[i]);
	}
}
}
