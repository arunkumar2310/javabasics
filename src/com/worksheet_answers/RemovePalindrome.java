package com.worksheet_answers;

import java.io.*;
import  java.util.*;

public class RemovePalindrome
{

	public int digitRemove_Palin(int input1){
		int count=0;
		String input=input1+"";
		for(int i=0;i<(input.length()/2)+1;i++){
			int first=Integer.parseInt(input.charAt(i)+"");
			int last=Integer.parseInt(input.charAt(input.length()-1-i)+"");
			if(first==last){
				continue;
			}
			else if(first!=last){
				int first1=Integer.parseInt(input.charAt(i+1)+"");
				int last1=Integer.parseInt(input.charAt(input.length()-2-i)+"");
				if(first1==last){
					count++;
					return first;
				}
				else if(last1==first){
					count++;
					return last;
				}
			}
		}
			return -1;
	}
}
