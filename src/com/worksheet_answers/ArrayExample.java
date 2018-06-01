package com.worksheet_answers;

public class ArrayExample {
	private int num;
	public ArrayExample(int n) {
		this.num=n;
	}
	public void Array() {
		int t,sum=0,sum1=1,temp=num;
    	while(num>0)
    	{
    		t=num%10;
    		sum=(sum*10)+t;
    		num=num/10;
    	}
    	int j=0,b[]=new int[10];
    	for(int i=1;i<10;i++)
    	{
    		if(temp/10!=0)
    		{
    			j++;
    			temp=temp/10;
    		}
    	}
    	for(int k=0;k<j;k++)
    	{
    		sum1=sum1*10;
    	}
    	for(int l=0;l<10;l++)
    	{
    		if(sum1<1)
    		{
    			b[l]=0;
    			continue;
    		}
    		b[l]=sum/sum1;
    		sum=sum%sum1;
    		sum1=sum1/10;
    		
    	}
    	for(int a=0;a<10;a++)
    	{
    	System.out.println(b[a]);
    	}
	}
public static void main(String[] args) {
	ArrayExample a1=new ArrayExample(4567);
	a1.Array();
	
}


}
