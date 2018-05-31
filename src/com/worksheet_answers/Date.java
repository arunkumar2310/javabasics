package com.worksheet_answers;

public class Date {
   private int month;
   private int day;
   private int year;
   public Date() {
	   
   }
   public Date(int day,int month,int year) {
	   this.day=day;
	   this.month=month;
	   this.year=year;
   }
public int getMonth() {
	return month;
}
public void setMonth(int month) {
	this.month = month;
}
public int getDay() {
	return day;
}
public int setDay(int day) {
	this.day = day;
	return day;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public void displayDate()
{
	System.out.println(day+"/"+month+"/"+year);
}
public static void main(String args[]) {
	Date day=new Date();
	int date=day.setDay(23);
	day.setMonth(10);
	day.setYear(1997);
	day.displayDate();
	Date day1=new Date(23,11,1997);
	day1.displayDate();
}
}
