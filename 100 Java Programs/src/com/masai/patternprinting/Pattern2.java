package com.masai.patternprinting;

import java.util.Scanner;

public class Pattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the input");
	int n=sc.nextInt();
	// first section
	for(int i=0;i<n-1;i++) {
		System.out.println("*");
	}
	
	// second section
	for(int j=0;j<n;j++) {
		System.out.print("*");
	}
	System.out.println();
	
	// third section
	for(int k=0;k<n-1;k++) {
		for(int l=0;l<n;l++) {
			if(l==n-1) {
				System.out.println("*");
			}else {
				System.out.print(" ");
			}
		}
	}
}
}
