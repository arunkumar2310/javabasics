package com.worksheet_answers;
import java.util.Scanner;

public class WifiPassword {
	public static int unitsPlaceValue=0;
	public static char tensPlaceValue; 
	public static char hundredsPlaceValue;
	public static int thousandsPlaceValue;
	public static String wifiPassword;
	public void unitsPlace(int num) {
		unitsPlaceValue=(num%100)/10;
	}
	public void tensPlace(String name) {
		int a=name.length();
		
		tensPlaceValue=name.charAt(a-1);
		
	}
	public void hunderdsPlace(int num1) {
		int a=num1%10;
		switch(a) {
		case 1:
			hundredsPlaceValue='!';
			break;
		case 2:
			hundredsPlaceValue='@';
			break;
		case 3:
			hundredsPlaceValue='#';
			break;
		case 4:
			hundredsPlaceValue='$';
			break;
		case 5:
			hundredsPlaceValue='%';
			break;
		case 6:
			hundredsPlaceValue='^';
			break;
		case 7:
			hundredsPlaceValue='&';
			break;
		case 8:
			hundredsPlaceValue='*';
			break;
		case 9:
			hundredsPlaceValue='(';
			break;
		case 0:
			hundredsPlaceValue=')';
			break;
		}
	}
	public void thousandsPlace(int num2) {
		int i,sum=0;
		while(num2>0) {
			i=num2%10;
			sum+=i;
			num2=num2/10;
		}
		if(sum>=10) {
			i=sum%10;
			thousandsPlaceValue+=i;
			sum=sum/10;
		}
		else {
			thousandsPlaceValue=sum;
		}
		
	}
	public void concatenate() {
		wifiPassword=thousandsPlaceValue+""+hundredsPlaceValue+""+tensPlaceValue+""+unitsPlaceValue;
		System.out.println(wifiPassword);
	}
	
	public static void main(String args[]) {
		String myName;
		int room;
		WifiPassword one=new WifiPassword();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the room number");
		room=scan.nextInt();
		//room=333;
		System.out.println("Enter your name");
		myName=scan.next();
		one.unitsPlace(room);
		one.tensPlace(myName);
		one.hunderdsPlace(room);
		one.thousandsPlace(room);
		one.concatenate();
	}

}
