package com.worksheet_answers;
import java.util.Scanner;

public class Special {
	public void isSpecial(String line) {
		int n=line.length();
		int count=0,i=0;
		if(((n==2)||(n==3)||(n==5)||(n==7))||(n%2!=0 && n%3!=0 && n%5!=0 && n%7!=0)) {
			String myString[]=line.split("//s");
			for(i=0;i<myString.length;i=i+2) {
				char a=myString[i].charAt(0);
				int b=(int)a;
				if(b>=65 && b<=90) {
					count++;
				}
			}
				if(count==i-2) {
					System.out.println("Special");
				}
				else {
					System.out.println("Not special");
				}
		}
	}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		Special obj=new Special();
		String line=scan.next();
		obj.isSpecial(line);
	}
}
