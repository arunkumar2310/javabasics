package com.inheritance;

public class Shapes {
	String stringOne;
    public String getstringOne() {
		return stringOne;
	}
	public void setstringOne(String stringOne) {
		this.stringOne =stringOne;
	}
	public void printShape(String shape1) {
    	System.out.println("Shape :"+shape1);
    	System.out.println(stringOne);
    }
}
