package com.polymorphism;
class SportsCar extends Car{
	public void brake() {
		System.out.println("Sports car brake");
	}
}
class Taxi extends Car{
	public void brake() {
		System.out.println("Taxi brake");
	}
}
class PoliceCar extends Car{
	public void brake() {
		System.out.println("Police car brake");
		super.brake();
	}
	
}
