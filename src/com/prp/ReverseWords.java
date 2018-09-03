package com.prp;
import java.util.*;

public class ReverseWords {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		//int input=scan.nextInt();
		String word[]= {"java.pro","in.po"};
		/*for(int i=0;i<input;i++) {
			word[i]=scan.next();
		}*/
		for(int i=0;i<word.length;i++) {
			String str[]=word[i].split("\\.");
			for(int j=str.length-1;j>=0;j--) {
				String a=str[j].charAt(0)+"";
				if(j==0) {
					str[j]=a.toUpperCase()+str[j].substring(1,str[j].length());
				}
				else {
					str[j]=a.toUpperCase()+str[j].substring(1,str[j].length())+".";
				}
				System.out.print(str[j]);
			}
			System.out.println();
		}

	}

}
