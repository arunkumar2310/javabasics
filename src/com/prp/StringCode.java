package com.prp;
import java.util.Scanner;

public class StringCode {
	public static String findStringCode(String input) {
		String output;
		String a[]=input.split(" ");
		int output1[]=new int[a.length];
		for(int i=0;i<a.length;i++) {
			char b[]=a[i].toCharArray();
			if(b.length%2==0) {
				int x[]=new int[b.length];
				int y=0;
				for(int j=0;j<b.length/2;j++) {
				int m=(int)b[j];
				int n=(int)b[b.length-1-j];
				int e=m-n;
				if(e<0) {
					x[y]=-e;
					y++;
				}
				else {
					x[y]=e;
					y++;
				}
				}
			}
		}
		return output;
	}
	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	String input1=scan.nextLine();
	StringCode obj=new StringCode();
	obj.findStringCode(input1);
	}
}
