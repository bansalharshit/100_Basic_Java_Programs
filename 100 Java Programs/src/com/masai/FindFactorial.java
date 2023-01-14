package com.masai;

import java.util.Scanner;

public class FindFactorial {
	// using recursion
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
	
		System.out.println("Enter the Number to Find the factorial ");
		int x=sc.nextInt();
		System.out.println(ff.factorial(x));
	
	
	
	
}
}
