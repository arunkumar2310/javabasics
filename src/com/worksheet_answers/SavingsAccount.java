package com.worksheet_answers;

public class SavingsAccount {
    private double savingsbalance;
	static double annualInterestRate;

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		SavingsAccount.annualInterestRate = annualInterestRate;
	}

	public double getSavingsbalance() {
		return savingsbalance;
	}

	public void setSavingsbalance(double savingsbalance) {
		this.savingsbalance = savingsbalance;
	}
	public double calculateMonthlyInterest()
	{
		return (((savingsbalance*(annualInterestRate/100.0))/12)+savingsbalance);
	}
    public static void modifyInterestRate(double annualInterestRate)
    {
    	SavingsAccount.annualInterestRate=annualInterestRate;
    }
    public static void main(String[] args)
    {
    	SavingsAccount saver1=new SavingsAccount();
    	SavingsAccount saver2=new SavingsAccount();
    	saver1.setSavingsbalance(3000.00);
    	saver1.setAnnualInterestRate(4);
    	saver2.setSavingsbalance(2000.00);
    	System.out.println("Monthly interest for saver1="+saver1.calculateMonthlyInterest());
    	System.out.println("Monthly interest for saver2="+saver2.calculateMonthlyInterest());
    	SavingsAccount.modifyInterestRate(5);
    	System.out.println("After increasing interest rate"+"\n"+"Monthly interest for saver1="+saver1.calculateMonthlyInterest());
    	System.out.println("Monthly interest for saver2="+saver2.calculateMonthlyInterest());
    	
    }
}
