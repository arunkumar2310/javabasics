package com.worksheet_answers;

public class SavingsAccount {
    static double savingsbalance;
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
		SavingsAccount.savingsbalance = savingsbalance;
	}
	public double calculateMonthlyInterest()
	{
		return ((savingsbalance*annualInterestRate)/12);
	}
    public void modifyInterestRate(double annualInterestRate)
    {
    	SavingsAccount.annualInterestRate=annualInterestRate;
    }
    public static void main(String[] args)
    {
    	SavingsAccount saver1=new SavingsAccount();
    	SavingsAccount saver2=new SavingsAccount();
    	saver1.setSavingsbalance(2000.00);
    	saver1.setAnnualInterestRate(0.04);
    	saver2.setAnnualInterestRate(0.04);
    	saver2.setSavingsbalance(3000.00);
    	System.out.println("Monthly interest for saver1="+saver1.calculateMonthlyInterest());
    	System.out.println("Monthly interest for saver2="+saver2.calculateMonthlyInterest());
    	saver1.modifyInterestRate(0.05);
    	saver2.modifyInterestRate(0.05);
    	saver1.setAnnualInterestRate(0.05);
    	saver2.setAnnualInterestRate(0.05);
    	System.out.println("After increasing interest rate"+"\n"+"Monthly interest for saver1="+saver1.calculateMonthlyInterest());
    	System.out.println("Monthly interest for saver2="+saver2.calculateMonthlyInterest());
    	
    }
}
