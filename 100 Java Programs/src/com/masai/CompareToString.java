package com.masai;

import java.util.Scanner;

public class CompareToString {
public static void main(String[] args) {
	String s1;
	String s2;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the first String");
	s1=sc.nextLine();
	System.out.println("Enter the Second String");
	s2=sc.nextLine();
	
	if(s1.compareTo(s2)>0) {
		System.out.println("First String is greater than Second");
		
	}else if(s1.compareTo(s2)<0) {
		System.out.println("Second String is Greater Than Second");
		
	}else
		System.out.println("Both String are equal.");
}
}
