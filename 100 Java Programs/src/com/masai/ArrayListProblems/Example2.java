package com.masai.ArrayListProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// how to do sorting 
public class Example2 {
public static void main(String[] args) {
	List<Integer> list=new ArrayList<>();
	list.add(1);
	list.add(3);
	list.add(2);
//	list.add(null);
	list.add(5);
	list.add(4);
	Collections.sort(list);
	Iterator itr=list.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("==============");
	ListIterator<Integer> list1=list.listIterator(list.size());
	while(list1.hasPrevious()) {
		Integer ir=list1.previous();
		System.out.println(ir);
	}
	System.out.println("===============");
	// using for each loop
	list.forEach(e->{
		System.out.println(e);
	});
	
}
}
