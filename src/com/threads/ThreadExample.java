package com.threads;

public class ThreadExample extends Thread{
    String name=null;
	public ThreadExample(String name) {
		this.name=name;
		//start();
	}
    @Override
    public void run() {
    	System.out.println(name);
    }
    public static void main(String[] args) {
		ThreadExample one=new ThreadExample("scooby");
		ThreadExample two=new ThreadExample("shaggy");
		one.start();
		two.start();
    }
}
