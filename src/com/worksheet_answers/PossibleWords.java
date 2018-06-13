package com.worksheet_answers;
import java.util.Scanner;

public class PossibleWords {
	String find[]=new String[2];
	String dir[]=new String[2];
	String answer[]=new String[10];
	int k=0;
	public void split1(String s1) {
		 find=s1.split("_");
	}
	public void split2(String s2) {
		 dir=s2.split(":");
		
	}
	public void possibleWord(PossibleWords obj){
		for(int i=0;i<dir.length;i++) {
			String s=dir[i];
			if(s.startsWith(find[0])&&s.endsWith(find[1])) {
				answer[k]=s.toUpperCase();
				k++;
			}
		}
		if(answer.length>0) {
			for(int i=0;i<k;i++) {
				if(i==k-1) {
					System.out.println(answer[i]);
				}
				else {
					System.out.print(answer[i]+":");
				}
			}
		}
		else {
			System.out.println("ERROR-009");
		}
	}
	public static void main(String args[]) {
		String input1;
		String input2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the word to be searched");
		input1=scan.next();
		System.out.println("Enter the sequence where it should be searched");
		input2=scan.next();
		PossibleWords obj=new PossibleWords();
		obj.split1(input1);
		obj.split2(input2);
		obj.possibleWord(obj);
		}
}
