package com.masai;

import java.util.Scanner;

public class FindFactorial {
	public int factorial(int x) {
		if(x==0 || x==1) {
			return 1;
		}else {
			return (x)*factorial(x-1);
		}
	}
public static void main(String[] args) {
	FindFactorial ff=new FindFactorial();
	Scanner sc=new Scanner( System.in);
	while(true) {
		System.out.println("Enter the Number to Find the factorial ");
		int x=sc.nextInt();
		System.out.println(ff.factorial(x));
		System.out.println("if want to exit then press No");
		String str=sc.nextLine();
		if(str.equalsIgnoreCase("no")) {
			break;
		}
	}
	
	
}
}
