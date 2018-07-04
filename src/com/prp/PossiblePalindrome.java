package com.prp;

import java.util.Arrays;
import java.util.Scanner;

public class PossiblePalindrome {
	public void largestPossiblePalindrome(String input1) {
		input1=input1.toUpperCase();
		int freq[]=new int[26];
		int sum=0,count=0,count1=0;
		byte[] arr=input1.getBytes();
		for(int i=0;i<arr.length;i++) {
			int a=arr[i]-64;
			freq[a]++;
		}
		Arrays.sort(freq);
		if(freq[25]==1) {
			sum=-1;
		}
		else {
		for(int j=25;j>=0;j--) {
			if(freq[j]!=0) {
				sum+=freq[j];
				count++;
				if(freq[j]%2!=0) {
					count1++;
				}
			}
			if(freq[j]==1||freq[j]==0) {
				if(count==count1) {
					sum--;
				}
				break;
			}
		}
		}
		System.out.println(sum);
	}
	public static void main(String args[] ){
		PossiblePalindrome obj=new PossiblePalindrome();
		Scanner scan=new Scanner(System.in);
		String input=scan.nextLine();
		obj.largestPossiblePalindrome(input);
	}
}
