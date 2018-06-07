package com.basic;

public class PassByReference {
	int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public static void main(String args[]) {
		PassByReference car=new PassByReference();
		car.setSpeed(100);
		System.out.println(car.getSpeed());
		Car car1=new Car();
		car1.aMethod(car);
		System.out.println(car.getSpeed());
	}
}
