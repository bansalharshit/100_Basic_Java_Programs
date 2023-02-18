package com.masai;

public class StringIndexOf {
public static void main(String[] args) {
	String s1="the is index of example";
	int index1=s1.indexOf("is");
	int index2= s1.indexOf("OF");
	int index3=s1.indexOf("example");
	
	System.out.println(index1+" "+index2+" "+index3);
	
	String s2="Harshit Bansal";
	for(int i=0;i<s2.length();i++) {
		
		System.out.println(s2.charAt(i)+"->"+s2.indexOf(s2.charAt(i)));
	}
}
}
