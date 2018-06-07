package com.polymorphism;

public class Test {
	public void brake(Car car) {
		car.brake();
	}
	public static void main(String args[]) {
		Test a=new Test();
		SportsCar sc=new SportsCar();
		PoliceCar pc=new PoliceCar();
		Taxi t=new Taxi();
		
		a.brake(pc);
		a.brake(sc);
		a.brake(t);
		
	}
}
