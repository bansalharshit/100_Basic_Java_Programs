package com.masai;

public class Compare2Strings {
public static void main(String[] args) {
	String s1="Hello";
	String s2="Hello";
	String s3="meklo";
	String s4="hemlo";
	
	System.out.println(s1.compareTo(s4)>0);
	System.out.println(s1.compareTo(s3)>0);
	System.out.println(s1.compareTo(s2)==0);
}
}
