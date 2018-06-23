package com.prp;

import java.util.*;
import java.lang.*;

public class Duplicate{
    public void findDuplicate(String input){
        String input1=input.toUpperCase();
        String a[]=input1.split(" ");
        if(a.length>1) {
        int count=1,h=0;
        String c="";
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(h!=j && a[i]!=c){
                    if(a[i].equalsIgnoreCase(a[j])){
                     count++;
                     h=j;
                     c=a[i];
                     System.out.println(a[i]);
                    }
                    
                }
            }
        }
        System.out.println(count);
        }
        else
        	System.out.println("\n");
    }
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        Duplicate obj=new Duplicate();
        obj.findDuplicate(input);
    }
}

