package com.masai;

import java.util.Scanner;
// some armstrong numbers are 153,371,9474,370,407,8208,1637
// what is armstrong number
// answer Armstrong number is a number that is equal to the sum of cubes of its digits. For example 0, 1, 153, 370, 371 and 407 are the Armstrong numbers
public class ArmstrongNo {
public static void main(String[] args) {
	
	int n,sum=0,temp,remainder,digit=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input a number to check if it is an armstrong Number");
	n=sc.nextInt();
	temp=n;
	// count the number of digits
	while(temp!=0) {
		digit++;
		temp=temp/10;
		
	}
	temp=n;
	while(temp!=0) {
		remainder=temp%10;
		sum=sum+power(remainder,digit);
		temp=temp/10;
		
	}
	if(n==sum)
		System.out.println(n + " is an amrstrong number");
	else
		System.out.println(n + " is not an armstrong number.");
	
	
}
public static int power(int n,int r) {
	int c,p=1;
	for(c=1;c<=r;c++) {
		p=p*n;
		
		
	}
	return p;
}
}
