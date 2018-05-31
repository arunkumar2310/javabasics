package com.worksheet_answers;

public class Perfect {
     private int var1;
     public void setVar1(int var1)
     {
    	 this.var1=var1;
     }
     public boolean isPerfect()
     {
    	 int sum=0;
    	 for(int i=1;i<=var1/2;i++)
    	 {
    		 if(var1%i==0)
    		 {
    			 sum+=i;
    		 }
    	 }
    	 if(sum==var1)
    	 {
    		 return true;
    	 }
    	 else
    	 {
    		 return false;
    	 }
     }
     public static void main(String[] args)
     {
    	 Perfect v1=new Perfect();	 
         v1.setVar1(100);
         System.out.println(v1.isPerfect());
     }
     
}
