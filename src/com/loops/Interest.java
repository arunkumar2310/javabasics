package com.loops;

public class Interest {
	public static void main(String args[]) {
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		if(gender=="Male") {
			if(age>0 && age<61) {
				System.out.println("Interest=9.2%");
			}
			else {
				System.out.println("Interest=8.3%");
			}
		}
		else {
			if(age>0&&age<59) {
				System.out.println("Interest=8.2%");
			}
			else {
				System.out.println("Interest=7.6%");
			}
		}
	}

}
