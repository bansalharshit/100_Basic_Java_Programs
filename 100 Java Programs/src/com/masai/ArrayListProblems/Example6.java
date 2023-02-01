package com.masai.ArrayListProblems;

import java.util.ArrayList;

// Java ArrayList example to remove elements
public class Example6 {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	System.out.println(al.isEmpty());
	System.out.println(al.size());
	al.add("Ravi");
	al.add("Vijay");
	al.add("Ajay");
	al.add("Anuj");
	al.add("gaurav");
	System.out.println(al.isEmpty());
	System.out.println(al);
	System.out.println("after removing "+al.remove("Vijay"));
	System.out.println("Removing 0th index element "+al.remove(0));
	System.out.println(al);
	al.removeIf(str->str.contains("Ajay"));
	System.out.println(al);
	al.clear();
	System.out.println("using clear command"+al);
	al.removeAll(al);
	System.out.println(al);
}
}
