package com.salary;

public class Salary {
	static int gross[]={1000,2000,3000,4000,5000,6000};
	double salary[]=new double[6];
	int j=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0;
	public void calSalary() {
		for(int i=0;i<6;i++)
		{
			salary[i]= 200+(gross[i]*0.09);
		}
		}
	public void findMax() {
		for(int k=0;k<6;k++)
			{
				double a=salary[k];
			
				if(200<=a && a<300)
				{
					j++;
				}
				else if(300<=a&& a<400) {
					b++;
				}
				else if(400<=a && a<500) {
					c++;
				}
				else if(500<=a && a<600) {
					d++;
				}
				else if(600<=a && a<700) {
					e++;
				}
				else if(700<=a && a<800) {
					f++;
				}
				else if(800<=a && a<900) {
					g++;
				}
				else if(900<=a && a<1000){
					h++;
				}
				else
				{
					i++;
				}
			}	
		}
		
	public void toPrint() {
				System.out.println("People with salary 200-299 ="+j);
				System.out.println("People with salary 300-399 ="+b);
				System.out.println("People with salary 400-499 ="+c);
				System.out.println("People with salary 500-599 ="+d);
				System.out.println("People with salary 600-699 ="+e);
				System.out.println("People with salary 700-799 ="+f);
				System.out.println("People with salary 800-899 ="+g);
				System.out.println("People with salary 900-999 ="+h);
				System.out.println("People with salary 1000 & above ="+i);
				
	}
	
	
	
	public static void main(String args[]) {
		Salary s1=new Salary();
		
		s1.calSalary();
		s1.findMax();
		s1.toPrint();
		}
		
		
	
}
