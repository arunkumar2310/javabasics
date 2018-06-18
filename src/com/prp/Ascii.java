package com.prp;

public class Ascii {
	public static void main(String args[]){
		int array[]= {97,99,112,65,48,77};
		for(int i=0;i<array.length;i++) {
			char c=(char)array[i];
			System.out.print(c);
		}
}
}