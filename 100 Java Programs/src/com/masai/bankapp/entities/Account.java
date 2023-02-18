package com.masai.bankapp.entities;

public abstract class Account {
	
private String accountNumber;
private String accountHolderName;
protected double balance;


public Account(String accountNumber,String accountHolderName,double balance) {
	this.accountNumber=accountNumber;
	this.accountHolderName=accountHolderName;
	this.balance=balance;
	
}

public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber=accountNumber;
}

public String getAccountHolderName() {
	return accountHolderName;
}

public void setAccountHolderName(String accountHolderName) {
	this.accountHolderName=accountHolderName;
}

public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance=balance;
}

public abstract void deposit(double amount);

public abstract void withdraw(double amount);
}
