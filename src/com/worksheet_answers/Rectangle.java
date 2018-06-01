package com.worksheet_answers;

public class Rectangle {
	private double length;
	private double breadth;
	public double getLenght() {
		return length;
	}
	public void setLenght(double length) {
		if(length>0.0 && length<20.0)
		{
		this.length = length;
		}
		else
		{
		System.out.println("Enter valid lenght");
		}
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		if(breadth>0.0 && breadth<20.0)
		{
		this.breadth = breadth;
		}
		else
		{
			System.out.println("Enter valid breadth");
		}
	}
	public double perimeter()
	{
		return ((2*length)+(2*breadth));
	}
	public double area() {
		return (length*breadth);
	}
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle();
		r1.setLenght(10.0);
		r1.setBreadth(10.0);
		System.out.println("Perimeter="+r1.perimeter());
		System.out.println("Area="+r1.area());
	}
}
