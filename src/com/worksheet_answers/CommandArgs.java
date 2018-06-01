package com.worksheet_answers;

public class CommandArgs {
      public static void main(String args[])
    		  {
    	  		double a[]=new double[50];
    	  		 double sum=0;
    	        for(int i=0;i<args.length;i++)
    	        {
    	        	a[i]=Double.parseDouble(args[i]);
    	        	sum=sum+a[i];
    	        }
    		  
    	       
    	       
    	        System.out.println(sum);
    		  }
}
