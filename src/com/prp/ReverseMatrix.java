package com.prp;
import java.util.Scanner;

public class ReverseMatrix {
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				a[i][j]=scan.nextInt();
			}
		}
		int x=0,y=0;
		for(int i=1;i>=0;i--) {
			for(int j=1;j>=0;j--) {
				b[i][j]=a[x][y];
				if(j==1&&i==1)
					y++;
				else if(i==1&&j==0) {
					x++;y--;}
				else if(i==0&&j==1)
					y++;
			}
		}
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println(b[i][j]);
			}
		}
	}
}
