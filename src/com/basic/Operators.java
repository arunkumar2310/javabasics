package com.basic;

public class Operators{
	public static void main(String s[]) {
		int var1=1;
		int var2=2;
		int var3=3;
		int var4=4;
		int var5;
		int var6;
		var5=var1+var2;
		var6=var3-var4;
		var1++;
		var2++;
		var3++;
		var4++;
		System.out.println("Sum="+var5+"\n"+"Difference="+var6+"\n");
		var6=var3<<var1;
		System.out.println(var6);
		var5=var4>>var2;
		System.out.println(var5);
		var4--;
		if(var3==var4&&var2!=var1)
		{
			int var7=var4>var2?10:20;
			System.out.println(var7);
		}
		if(var3!=var4||var2!=var1)
		{
			int var7=var4<var2?10:20;
			System.out.println(var7);
		}
		int var7=~var5;
		System.out.println(var7);
				
	}
	

}
