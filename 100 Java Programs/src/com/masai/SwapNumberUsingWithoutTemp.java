package com.masai;

import java.util.Scanner;
// good approach
public class SwapNumberUsingWithoutTemp {
public static void main(String[] args) {
	int x;
	int y;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	x=sc.nextInt();
	System.out.println("Enter second Number");
	y=sc.nextInt();
	
	System.out.println("Before Swapping \nx = "+x+ "\ny = "+y);
	
	x=x+y;
	y=x-y;
	x=x-y;
	
	System.out.println("after Swapping \nx = "+x+ "\ny = "+y);
}
}
