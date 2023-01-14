package com.masai;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FahrenheittoCelsius {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	try {
		float temeratue;
		
		System.out.println("Enter Temperature in Fahrenheit");
		temeratue=sc.nextInt();
		temeratue=((temeratue-32)*5)/9;
		System.out.println("Temperature in Celsius = "+temeratue);
		
	} catch (InputMismatchException e) {
		// TODO: handle exception
	System.out.println("Given Input Should not Be String");
	}
	
	sc.close();
}

}
