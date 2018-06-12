package com.worksheet_answers;
import java.util.Scanner;

public class Encoding {
	String x[]=new String[3];
	String y[]=new String[3];
	String z[]=new String[3];
	//  checks string one
	public void toSplit3(String s1) {
			int j=0;
			char a,b,c;
			int div=s1.length()/3;
			if(div==1) {
				for(int i=0;i<s1.length();i=i+1) {
					a=s1.charAt(i);
					x[j]=a+"";
					//System.out.println(x[j]);
					j++;
				}
				}
			else if(div==2) {
				for(int i=0;i<s1.length();i=i+2) {
					a=s1.charAt(i);
					b=s1.charAt(i+1);
					x[j]=a+""+b;
					//System.out.println(x[j]);
					j++;
				}
				}
			else if(div==3) {
			for(int i=0;i<s1.length();i=i+3) {
				a=s1.charAt(i);
				b=s1.charAt(i+1);
				c=s1.charAt(i+2);
				x[j]=a+""+b+""+c;
				//System.out.println(x[j]);
				j++;
			}
			}
		}
//	checks string 2
	public void toSplit4(String s2) {
		char a,b,c;
		int j=0;
		
		int div=s2.length()/3;
		//if string 2 is 4 lettered word
		if(div==1) {
			for(int i=0;i<s2.length();i=i+1) {
				if(i==1) {
					a=s2.charAt(i);
					b=s2.charAt(i+1);
					y[j]=a+""+b;
					j++;
					i=i+1;
				}
				else {
				a=s2.charAt(i);
				y[j]=a+"";
				j++;
				}
			}
		}
		else {
			for(int i=0;i<s2.length();i=i+1) {
				if(i==2) {
					a=s2.charAt(i);
					b=s2.charAt(i+1);
					c=s2.charAt(i+2);
					y[j]=a+""+b+""+c;
					j++;
					i=i+2;
				}
				else {
				a=s2.charAt(i);
				b=s2.charAt(i+1);
				y[j]=a+""+b;
				j++;
				i=i+1;
				}
			}
			
		}
	}
	// checks string 3
	public void toSplit5(String s3) {
		
		int k=0;
		char a,b,c;
		int div=s3.length()/3;
		//if string 3 is 5 lettered
		if(div==2) {
		for(int i=0;i<s3.length();i++) {
			if(i==2) {
				a=s3.charAt(i);
				z[k]=a+"";
				k++;
			}
			else {
			a=s3.charAt(i);
			b=s3.charAt(i+1);
			z[k]=a+""+b;
			k++;
			i=i+1;
			}
		}
		}
		else {
			for(int i=0;i<s3.length();i++) {
				if(i==3) {
					a=s3.charAt(i);
					b=s3.charAt(i+1);
					z[k]=a+"";
					k++;
					i=i+1;
				}
				else {
				a=s3.charAt(i);
				b=s3.charAt(i+1);
				c=s3.charAt(i+2);
				z[k]=a+""+b+""+c;
				k++;
				i=i+2;
				}
			}
			
		}
	}
	public void toConcate(Encoding obj1) {
		String output1;
		String output2;
		String output3;
		int i=0;
		char g[]=new char[10];
		output1=x[i]+y[i+1]+z[i+2];
		output2=x[i+1]+y[i+2]+z[i];
		output3=x[i+2]+y[i]+z[i+1];
		System.out.println(output1);
		System.out.println(output2);
		for(int h=0;h<output3.length();h++) {
			int a=(int)output3.charAt(h);
			if(a>90) {
				a=a-32;
			}
			else {
				a=a+32;
			}
			g[h]=(char)a;	
		}
		for(int l=0;l<g.length;l++) {
		System.out.print(g[l]);
		}
	}
	
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter three strings");
		String s1=scan.nextLine();
		String s2=scan.nextLine();
		String s3=scan.nextLine();
		Encoding obj1=new Encoding();
		obj1.toSplit3(s1);
		obj1.toSplit4(s2);
		obj1.toSplit5(s3);
		obj1.toConcate(obj1);
	}
}
