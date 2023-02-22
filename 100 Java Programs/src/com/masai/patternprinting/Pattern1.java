package com.masai.patternprinting;

import java.util.Scanner;

public class Pattern1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter The Input");
	int n=sc.nextInt();
	for(int i=0;i<n;i++) {
	if(i==n-1) {
		for(int j=0;j<n;j++) {
			System.out.print("*");
		}
	}else {
		System.out.println("*");
	}
	
}
	System.out.println();
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