package com.masai.patternprinting;

import java.util.Scanner;

public class SolidRectangle {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of rows");
	int n=sc.nextInt();
	System.out.println("enter number of columns");
	int m=sc.nextInt();
	for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
//	System.out.println(10+20+"Ramesh"+10);
}
}
