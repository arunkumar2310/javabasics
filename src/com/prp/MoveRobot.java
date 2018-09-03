package com.prp;

import java.util.Arrays;
import java.util.Scanner;

public class MoveRobot {
	public void findPosition(int input1,int input2,String input3,String input4) {
		String arr[]=input3.split("-");
		int x=Integer.parseInt(arr[0]);
		int y=Integer.parseInt(arr[1]);
		String dir=arr[2];
		String input[]=input4.split(" ");
		for(int i=0;i<input.length;i++){
			switch(input[i]) {
			case "R":
				if(dir.equals("E")) {
					dir="S";
				}
				else if(dir.equals("S")) {
					dir="W";
				}
				else if(dir.equals("W")) {
					dir="N";
				}
				else {
					dir="E";
				}
				break;
			case "L":
				if(dir.equals("E")) {
					dir="N";
				}
				else if(dir.equals("S")) {
					dir="E";
				}
				else if(dir.equals("W")) {
					dir="S";
				}
				else {
					dir="W";
				}
				break;
			case "M":
				if(dir.equals("E")) {
					x++;
				}
				else if(dir.equals("W")) {
					x--;
				}
				else if(dir.equals("S")) {
					y--;
				}
				else {
					y++;
				}
				break;
			}
		}
		if(x>input1) {
			x=input1;
			dir+="-ER";
		}
		else if(x>input2) {
			y=input2;
			dir+="-ER";
		}
		String output=x+"-"+y+"-"+dir;
		System.out.println(output);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int input1=scan.nextInt();
		int input2=scan.nextInt();
		String input3=scan.next();
		String input4=scan.nextLine();
		//String arr1=Arrays.toString(input4);
		MoveRobot obj=new MoveRobot();
		obj.findPosition(input1,input2,input3,input4);
	}

}
