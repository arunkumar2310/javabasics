package com.prp;

import java.lang.*;
import java.util.*;

public class Html{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String size1=scan.nextLine();
        int size=Integer.parseInt(size1);
        String input[]=new String[size];
        for(int i=0;i<size;i++){
            input[i]=scan.nextLine();
            System.out.println(i+input[i]);
        }
        String answer[]=new String[10];
        int x=0;
        
        for(int i=0;i<size;i++){
        	//System.out.println("i="+i);
            String arr[]=input[i].split("/");
          //  System.out.println(arr.length);
            for(int j=0;j<arr.length;j++){
                if((arr[j].endsWith("<"))){
                	//System.out.println(arr[j]);
                    String arr1[]=arr[j].split(">");
                    for(int k=0;k<arr1.length;k++){
                    	//System.out.println(arr1[k]);
                        if(arr1[k].charAt(0)!='<'){
                            int a=arr1[k].length();
                            if(a>5) {
                            	if(i==2) {
                            		answer[x]="None";
                            		x++;
                            	}
                            	else {
                                answer[x]=arr1[k].substring(0,a-1);
                                  x++;
                            	}
                            }
                        }
                    }
                }
            }
        }
        for(int k=0;k<x;k++){
            System.out.println(answer[k]);
        }
    }
}
