package com.interface_example;

public abstract class Animal implements ITravel{

	
}
	class Dog extends Animal{
		public void toPrint() {
			System.out.println("Dog");
		}
	}
	class Cat extends Animal{
		public void toPrint() {
			System.out.println("Cat");
		}
	}


