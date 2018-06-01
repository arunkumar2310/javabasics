package com.worksheet_answers;

public class Maximum {
      private int a[]= {3,4,5,2,33,24,2};
      public void order()
      {
    	  for(int i=0;i<a.length;i++)
    	  {
    		  for(int j=0;j<a.length;j++)
    		  {
    			  if(a[i]<=a[j])
    			  {
    				  int temp=a[i];
    				  a[i]=a[j];
    				  a[j]=temp;
    		      }
    		  
    	      }
          }
    	  System.out.println("Maximum="+a[a.length-1]);
    	  System.out.println("Minimum="+a[0]);
      }
      public static void main(String args[])
      {
    	  Maximum m1=new Maximum();
    	  m1.order();
      }
}
