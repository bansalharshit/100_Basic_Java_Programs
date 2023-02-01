package com.masai.ArrayListProblems;

import java.util.ArrayList;
import java.util.Iterator;

public class Example1 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Mango");
	list.add("Apple");
	list.add("Banana");
	list.add("Oranges");
	
	// replacing the element at specific index
	list.set(0, "Dates");
	list.add(2,"berries");
	System.out.println(list);
	System.out.println("==============");
	// using enhanced for loop/ for each loop
	for(String s:list) {
		System.out.println(s);
	}
	System.out.println("==============");
	// Using for loop
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	System.out.println("================");
	// using iterator
     Iterator itr=list.iterator();
     while(itr.hasNext()) {
    	 System.out.println(itr.next());
     }
     System.out.println("=================");
     System.out.println("Returning Element: "+list.get(0));
}
}
