package com.commandLineArgs;

public class Sum {
	public static void main(String args[]) {
		int sum=0;
		for(int i=0;i<args.length;i++) {
			sum=sum+Integer.parseInt(args[i]);
		}
		System.out.println("The sum of "+args[0]+" and "+args[1]+" is "+sum);
	}
}
