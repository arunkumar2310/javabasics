package com.worksheet_answers;

public class Even {
    private int var1;

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public boolean isEven()
	{
		return var1%2==0 ? true:false;
	}
    public static void main() {
    	Even v1=new Even();
    	v1.setVar1(5);
    	System.out.println(v1.isEven());
    }
}
