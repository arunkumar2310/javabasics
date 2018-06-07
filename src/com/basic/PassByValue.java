package com.basic;

public class PassByValue {
	 int speed;
/*	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	} */
	public void Change(int i) {
		i=i+10;
	}
	public static void main(String args[]) {
		PassByValue car=new PassByValue();
		car.speed=100;
		System.out.println(car.speed);
		car.Change(car.speed);      //Here only the copy of speed is sent
		System.out.println(car.speed);
	}
}
