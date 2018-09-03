package com.worksheet_answers;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			int n=scan.nextInt();
			int option=scan.nextInt();
			int result=n,d=0;
			for(int i=1;d!=1;i++) {
				d=n-i;
				if(option==1) {
					if(i%2==0) {
						result+=d;
					}
					else {
						result-=d;
					}
				}
				else if(option==2) {
					if(i%2==0) {
						result-=d;
					}
					else {
						result+=d;
					}
				}
			}
			System.out.println(result);
			
	}

}
