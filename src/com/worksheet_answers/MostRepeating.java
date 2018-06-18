package com.worksheet_answers;

public class MostRepeating {
	public static void main(String args[]) {
		int a[]= {1,2,3,4,2,3,4,3,5,4,4};
		int count=0;
		int max=0,index=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i!=j && a[i]==a[j]) {
					count++;
				}
				if(count>max) {
					max=count;
					index=i;
				}
			}
		}
		System.out.println(a[index]);
	}
}
