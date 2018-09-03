package com.prp;
import java.util.Scanner;

public class StringCode {
	public static String findStringCode(String input) {
		input=input.toUpperCase();
		String output1="";
		String a[]=input.split(" ");
		int sum=0,m=0,n=0,e=0;
		for(int i=0;i<a.length;i++) {
			char b[]=a[i].toCharArray();
			if(b.length%2==0) {
				System.out.println("  EVE");
				for(int j=0;j<b.length/2;j++) {
				 m=(int)b[j];
				 n=(int)b[b.length-1-j];
			      e=(m-n);
				    sum=sum+e;
				   }
				//System.out.println(m+" "+n+" "+" "+e+" "+sum);
			}
			
			else {
				//System.out.println("  ODD");
				for(int j=0;j<=b.length/2;j++) {
				
					if(j==b.length/2) {
						 e=(int)b[b.length/2]-64;
					}
					else {
						 m=(int)b[j];
						 n=(int)b[b.length-1-j];
						 e=(m-n);
					}
				    sum=sum+e;
				   // System.out.println(b.length/2+" "+j+" "+m+" "+n+" "+" "+e+" "+sum);
				}
			    }
			
			output1=output1+sum+"";
			sum=0;
			}
		
		return output1;
	}
	public static void main(String args[]) {
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	String input1=scan.nextLine();
	@SuppressWarnings("unused")
	StringCode obj=new StringCode();
	String a=findStringCode(input1);
	System.out.println(a);
	}
}
