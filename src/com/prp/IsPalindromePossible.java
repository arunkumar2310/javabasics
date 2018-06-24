package com.prp;
import java.util.*;

public class IsPalindromePossible {
	public static void isPalindrome(int input) {
		int a[]=new int[10];
		int freq[]=new int[10];
		int rem=0;
		int x=0;
		int count=0;
		
		for(int i=0;input>0;i++)
		{
			rem=input%10;
			a[i]=rem;
			input/=10;
			x++;
		}
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<x;j++) {
				if(i==a[j]) {
					count++;
				}
			}
			freq[i]=count;
			count=0;
		}
		
		Arrays.sort(freq);
		
		for(int k:freq) {
			System.out.println(k);
		}
		int j=0;
		
		if(x%2!=0) {
			for(int i=0;i<freq.length;i++) {
				if(freq[i]%2==1) {
					j++;
				}
			}
			
			if(j==1) {
			//if((freq[9]%2==0&&freq[8]%2==1&&freq[7]==0)||(freq[9]%2==1&&freq[8]%2==0&&freq[7]==0)||(freq[9]%2==0&&freq[8]%2==0&&freq[7]%2==1&&freq[6]==0)) {
				System.out.println("Palindrome is possible");
			}
			else {
				System.out.println("Palindrome is not possible");
			}
		}
		else {
			for(int i=0;i<freq.length;i++) {
				if(freq[i]%2==0) {
					j++;
					break;
				}
			}

			//if((freq[9]%2==0&&freq[8]%2==0&&freq[7]==0)||(freq[9]%2==1&&freq[8]%2==1&&freq[7]==0)||(freq[9]%2==1&&freq[8]%2==1&&freq[7]%2==1&&freq[6]==0)||(freq[9]%2==0&&freq[8]%2==0&&freq[7]%2==0&&freq[6]==0)) {
			if(j%2==0) {	
				System.out.println("palindrome is possible");
			}
			else {
				System.out.println("Palindrome is not possible");
			}
		}
		}
	public static void main(String args[]) {
		Scanner scan=new Scanner(System.in);
		int input=scan.nextInt();
		isPalindrome(input);
	}
}
