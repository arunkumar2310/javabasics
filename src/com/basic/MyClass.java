package com.basic;

public class MyClass extends Thread implements Runnable
{
	public void run() {
		System.out.println("arun");
	}
    public static void main( String[] args )throws Exception
    {
        Thread t=new MyClass();
        t.start();
        t.run();
    }
}

