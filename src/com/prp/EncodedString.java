package com.prp;

import java.util.Scanner;

public class EncodedString {
    
	public void findChar(String input1,int input2) {
		String result="";
		for(int i=0;i<input1.length();i++) {
			char a=input1.charAt(i);
			char b=input1.charAt(i+1);
			if(Character.isLetter(a)&&Character.isDigit(b)) {
				int b1=Character.getNumericValue(b);
				for(int j=0;j<b1;j++) {
					result+=a+"";
				}
				i++;
			}
			else {
				result+=a+"";
			}
		}
		if(input2<result.length())
			System.out.println(result.charAt(input2));
		else
			System.out.println("*");
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		int num=scan.nextInt();
		EncodedString obj=new EncodedString();
		obj.findChar(input,num);
	}

}
