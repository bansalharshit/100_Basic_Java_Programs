package com.masai.Java111C2.Question1;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Number of Student");
	int number=sc.nextInt();
	int i=1;
	while(i<=number) {
		System.out.println("Enter roll");
		int roll=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter marks");
		int marks=sc.nextInt();
		
		Student s1=new Student(roll,name,marks);
		
		System.out.println("Student Detail "+i);
		System.out.println("Student Roll Number "+s1.getRoll());
		System.out.println("Student Name  "+s1.getName());
		System.out.println("Student Marks  "+s1.getMarks());
		System.out.println("--------------------------------");
		i++;
	}
}
}
