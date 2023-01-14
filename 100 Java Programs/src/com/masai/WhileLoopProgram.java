package com.masai;

import java.util.Scanner;

public class WhileLoopProgram {
public static void main(String[] args) {
	int n;
	Scanner sc=new Scanner(System.in);
	System.out.println("Input an Integer");
	while((n=sc.nextInt())!=0) {
		System.out.println("Entered Number "+n);
		System.out.println("===================");
		System.out.println("Input an Integer/if want to exist then enter 0");
	}
	System.out.println("Out of the loop");
}
}
