package com.basic;

public class Test {
	public static void main(String args[]) {
	int prime=0;
	for(int i=700;i<=730;i++){
		//if((i==2 || i==3 || i==5 || i==7 || i==11) || ((i%2!=0) && (i%3!=0) && (i%5!=0) && (i%7!=0) &&(i%13!=0))){
		int count=0;
		for(int j=2;j<i/2;j++) {
			if(i%j==0) {
		   	count++;
			break;
			}
		}
		if(count==0) {
			prime+=1;
		}
	}
	System.out.println(prime);
}
}
