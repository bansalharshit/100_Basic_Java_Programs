package com.masai.bankapp.entities;

public class Bank {

	private Account[] accounts;
	
	public Bank(Account[] accounts) {
		this.accounts=accounts;
	}
	
	public void deposit(String accountNumber,double amount) {
		for(Account account: accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				account.deposit(amount);
				System.out.println("Money has been Deposited Successfully !");
				return;
			}
		}
		System.out.println("Account does not exist with given account number "+accountNumber);
	}
	
	public void withdraw(String accountNumber,double amount) {
		for(Account account:accounts) {
			if(account.getAccountNumber().equals(accountNumber)) {
				account.withdraw(amount);
				System.out.println("Amount has been withdrawl successfully !");
				return;
			}
		}
		System.out.println("Account not found !");
	}
}
