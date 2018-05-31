package com.worksheet_answers;

public class Multiple {
	private int var1;
	private int var2;
	
    public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	public boolean isMethod()
    {
    	if(var2%var1==0)
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
    	Multiple a1=new Multiple();
    	a1.setVar1(5);
    	a1.setVar2(10);
    	System.out.println(a1.isMethod());
    }
}
