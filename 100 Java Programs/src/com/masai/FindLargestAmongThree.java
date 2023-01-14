package com.masai;

import java.util.Scanner;

public class FindLargestAmongThree {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first number");
	int x=sc.nextInt();
	System.out.println("Enter second number");
	int y=sc.nextInt();
	System.out.println("Enter third number");
	int z=sc.nextInt();
	
	if(x>y && x>z)
		System.out.println("First Number is Largest");
	else if(y>x && y>z)
		System.out.println("Second Number is Largest");
	else if(z>x && z>y)
		System.out.println("Third Number is Largest");
}
}
