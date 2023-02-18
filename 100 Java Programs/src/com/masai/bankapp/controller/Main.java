package com.masai.bankapp.controller;

import com.masai.bankapp.entities.Account;
import com.masai.bankapp.entities.Bank;
import com.masai.bankapp.entities.CheckingAccount;
import com.masai.bankapp.entities.SavingAccount;

public class Main {
public static void main(String[] args) {
	Account[] accounts=new Account[2];
	accounts[0]=new SavingAccount("1001", "John Smith", 1000.0, 0.02);
	accounts[1]=new CheckingAccount("2001", "Pooja Bansal", 500.0, 1000.0);
	
	Bank bank=new Bank(accounts);
	bank.deposit("1002", 500.0);
	bank.withdraw("2001", 1000.0);
}
}
