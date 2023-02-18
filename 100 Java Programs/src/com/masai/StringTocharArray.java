package com.masai;

public class StringTocharArray {
public static void main(String[] args) {
	String s1="Harshit bansal";
	char[] ch=new char[s1.length()];
	for(int i=0;i<s1.length();i++) {
		ch[i]=s1.charAt(i);
	}
	System.out.println(ch);
	System.out.println("^^^^^^^^^^^^^");
	for(char c1:ch)
		System.out.println(c1);
	System.out.println("==============");
	String[] strarr= {"H","A","R","S","H","I","T"};
	for(int i=0;i<strarr.length;i++) {
		System.out.print(strarr[i]);
	}
	System.out.println("\n");
	char[] arr=s1.toCharArray();
	
	System.out.println(arr);
	System.out.println(strarr.toString());
	for(int i=0;i<s1.length();i++) {
		System.out.println(s1.charAt(i));
	}
	System.out.println("String to Char Array");
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]);
	}
	System.out.println("\n");
	System.out.println("=============");
	for(char c:arr) {
		System.out.print(c);
	}
}
}
