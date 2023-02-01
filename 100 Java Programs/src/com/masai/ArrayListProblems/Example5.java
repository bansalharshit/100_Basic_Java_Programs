package com.masai.ArrayListProblems;

import java.util.ArrayList;
import java.util.List;

public class Example5 {
public static void main(String[] args) {
	List<String> list1=new ArrayList<>();
	list1.add("Harshit");
	list1.add("Pooja");
	List<String> list2=new ArrayList<>();
	list2.add("Vinay");
	list2.add("Neeta");
	
	list1.addAll(list2);
	System.out.println(list1);
	
	List<String>list3=new ArrayList<>();
	list3.add("John");
	list3.add("Rahul");
	list1.addAll(list3);
	System.out.println(list1);
	list1.addAll(1, list3);
	System.out.println(list1);
}
}
