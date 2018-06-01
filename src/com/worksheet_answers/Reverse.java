package com.worksheet_answers;

public class Reverse {
	private int num;
	private Reverse(int num)
	{
		this.num=num;
	}
    public void toReverse()
    {
    	int t,sum=0;
    	while(num>0)
    	{
    		t=num%10;
    		sum=(sum*10)+t;
    		num=num/10;
    	}
    	System.out.println(sum);
    }
    public static void main(String[] args)
    {
    	Reverse r1=new Reverse(4567);
    	r1.toReverse();
    }
}
