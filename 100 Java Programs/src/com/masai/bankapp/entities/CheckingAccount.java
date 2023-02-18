package com.masai.bankapp.entities;

public class CheckingAccount extends Account{

	private double overDraftLimit;
	
	public CheckingAccount(String accountNumber, String accountHolderName, double balance,double overDraftLimit) {
		super(accountNumber, accountHolderName, balance);
		this.overDraftLimit=overDraftLimit;
	}

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance=balance+amount;
		
	}

	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		if(balance-amount>=-overDraftLimit) {
			balance=balance-amount;
		}else {
			System.out.println("Insufficient Balance !");
		}
		
	}

}
