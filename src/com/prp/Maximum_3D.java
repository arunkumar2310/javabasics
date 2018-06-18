package com.prp;
import java.util.Scanner;

public class Maximum_3D {
	public static void main(String args[]) {
		int a[][]=new int[3][3];
		int max=0;
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				a[i][j]=scan.nextInt();
				if(max<a[i][j])
					max=a[i][j];
			}
		}
		System.out.println(max);
	}
}
