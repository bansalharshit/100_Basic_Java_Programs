package com.masai;

import java.util.Scanner;

public class InputUsingScanner {
public static void main(String[] args) {
	int a;
	float b;
	String s;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a String");
	s=sc.nextLine();
	System.out.println("You entered Staring "+s);
	
	System.out.println("Enter an Integer");
	a=sc.nextInt();
	System.out.println("You Entered Inter "+a);
	
	System.out.println("Enter a float");
	b=sc.nextFloat();
	System.out.println("You Entered Float "+b);
}
}
