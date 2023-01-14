package com.masai;

import java.math.BigInteger;
import java.util.Scanner;

public class AddingLargeNumbers {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		String number1,number2;
		
		System.out.println("first number");
		number1=sc.nextLine();
		System.out.println("second number");
		number2=sc.nextLine();
		
		BigInteger first=new BigInteger(number1);
		BigInteger second=new BigInteger(number2);
		
		BigInteger sum=first.add(second);
		System.out.println("result "+sum);
	} catch (NumberFormatException e) {
		// TODO: handle exception
		System.out.println("given input should be numeric value");
	}catch (Exception e) {
		// TODO: handle exception
e.printStackTrace();
	}
	finally {
		sc.close();
	}
	
}
}
