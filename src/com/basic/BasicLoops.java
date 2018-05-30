package com.basic;

public class BasicLoops {
public static void main(String s[]) {
	int var1=1,count=0;
	while(var1<5)
	{
	count++;
	System.out.println(var1);
	var1++;
	}
	System.out.println(count);
	do {
		count++;
		System.out.println(var1);
		var1++;
	}while(var1<5);
	
}
}
