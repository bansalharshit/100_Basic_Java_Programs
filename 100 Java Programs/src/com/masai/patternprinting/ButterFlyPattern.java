package com.masai.patternprinting;

public class ButterFlyPattern {
public static void main(String[] args) {
	int n=5;
	// first half-upperhalf
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		int spaces=2*(n-i);
		for(int j=1;j<=spaces;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	
	for(int i=n;i>=1;i--) {
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		int spaces=2*(n-i);
		for(int j=1;j<=spaces;j++) {
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
