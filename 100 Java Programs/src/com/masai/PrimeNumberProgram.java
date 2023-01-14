package com.masai;

import java.util.Scanner;

public class PrimeNumberProgram {
public static void main(String[] args) {
	int n;
	int status=1;
	int num=3;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number for which you want the range of first n prime number");
	n=sc.nextInt();
	if(n>=1) {
		System.out.println("First "+n+" prime numbers are :-");
		System.out.println(2);
	}
	for(int count=2;count<=n;count++) {
		for(int j=2;j<=Math.sqrt(num);j++) {
			if(num%j==0) {
				status=0;
				break;
			}
		}
		if(status!=0) {
			System.out.println(num);
			count++;
		}
		status=1;
		num++;
	}
}
}
