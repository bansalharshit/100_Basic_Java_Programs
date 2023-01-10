package com.masai;

import java.util.Scanner;

public class SwapNumbersUsingTemp {
public static void main(String[] args) {
	int x , y , temp;
	
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter first number or digit");
	x=sc.nextInt();
	
	System.out.println("Enter Second number or digit");
	y=sc.nextInt();
	System.out.println("Before Swapping\nx = "+x+"\ny = "+y);
	temp=x;
	x=y;
	y=temp;
	System.out.println("After Swapping\nx = "+x+"\ny = "+y);
}
}
