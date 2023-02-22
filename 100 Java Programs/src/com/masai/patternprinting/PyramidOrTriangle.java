package com.masai.patternprinting;

public class PyramidOrTriangle {
	public static void main(String[] args) {
		
	
	int n=12;
	for(int i=1;i<=n;i++) {
		// for space
				for(int j=1;j<=n-i;j++) {
					System.out.print(" ");
				}		
		// for star
		for(int j=1;j<=i;j++) {
			System.out.print("* ");
		}
		
		System.out.println();
	}
}
}