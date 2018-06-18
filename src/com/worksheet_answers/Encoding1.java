package com.worksheet_answers;
import java.util.Scanner;

public class Encoding1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string");
		String a=sc.next();
		System.out.println("Enter the second string");
		String b=sc.next();
		System.out.println("Enter the third string");
		String c=sc.next();
		String str[]=divideString(a);
		String str1[]=divideString(b);
		String str2[]=divideString(c);
		System.out.println(str[0]+""+str1[1]+""+str2[2]);
		System.out.println(str[1]+""+str2[2]+""+str2[0]);
		System.out.println(str[2]+""+str2[0]+""+str2[1]);

	}
	public static String[] divideString(String d) {
		int r=d.length()%3;
		int q=d.length()/3;
		String s1="";
		String s2="";
		String s3="";
		if(r==1)
		{
			s1=d.substring(0, q);
			s2=d.substring(s1.length(),s1.length()+2+1);
			s3=d.substring(s2.length()+s1.length(),d.length());		
		}
		if(r==2)
		{
			s1=d.substring(0,q+1);
		    s2=d.substring(s1.length(),s1.length()+q );
		    s3=d.substring(s2.length()+s1.length(),d.length());
	    }
		if(r==0)
		{
			s1=d.substring(0,q);
			s2=d.substring(s1.length(),s1.length()+q);
			s3=d.substring(s2.length()+s1.length(),d.length());
		} 
		return new String[]{s1,s2,s3};
		}

}
