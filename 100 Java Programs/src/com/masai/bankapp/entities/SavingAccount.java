package com.masai.bankapp.entities;

public class SavingAccount extends Account {

	private double rateOfInterest;
	
	public SavingAccount(String accountNumber,String accountHolderName,double balance,double rateOfInterest) {
		super(accountNumber,accountHolderName,balance);
		this.rateOfInterest=rateOfInterest;
	}
	
	@Override
	public void deposit(double amount) {
		balance=balance+amount;
		balance=balance+(balance*rateOfInterest);
	}
	
	@Override
	public void withdraw(double amount) {
		if(balance-amount>=0) {
			balance=balance-amount;
			balance=balance+(balance*rateOfInterest);
		}else {
			System.out.println("Insufficient balance!");
		}
	}
}
