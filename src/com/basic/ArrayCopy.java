package com.basic;

public class ArrayCopy {
public static void main(String Args[]) {
	int a[]= {2,3,4,5,6,7,8,9};
	int b[]=new int[5];
	System.arraycopy(a, 3, b, 0, 5);
	for(int i=0;i<5;i++) {
		System.out.println(b[i]);
	}
	String c="meow";
	String d=c+"deal";
	String e="meowdeal";
	String f="meowdeal";
	System.out.println("d="+d);
	System.out.println("e="+e);
	System.out.println("f="+f);
	System.out.println("d="+d.hashCode());
	System.out.println("e="+e.hashCode());
	System.out.println("f="+f.hashCode());
	System.out.println(d==e);
	System.out.println(d.equals(e));
	System.out.println(e==f);
}
}
