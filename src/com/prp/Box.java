package com.prp;

public class Box {
	public static Double length;
	public static Double breadth;
	public static Double heigth;
	public Box(Double length,Double breadth,Double heigth) {
		this.length=length;
		this.heigth=heigth;
		this.breadth=breadth;
	}
	public double getVolume() {
		return length*breadth*heigth;
	}
	public static void main(String args[]) {
		Box obj=new Box(2.3,4.4,5.5);
		Double a=obj.getVolume();
		System.out.println(a);
	}
}
