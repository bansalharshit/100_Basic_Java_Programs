package com.masai.ArrayListProblems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student{
	int rollno;
	String name;
	int age;
	Student(int rollno,String name,int age){
		this.rollno=rollno;
		this.name=name;
		this.age=age;
		
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
	
}
public class Example3 {
public static void main(String[] args) {
	Student s=new Student(101, "Harshit", 24);
	Student s1=new Student(102, "Akash", 25);
	Student s2=new Student(103, "Bihari", 30);
	
	List<Student> listofstudent=new ArrayList<Student>();
	listofstudent.add(s);
	listofstudent.add(s1);
	listofstudent.add(s2);
	
	Iterator itr=listofstudent.iterator();
	while(itr.hasNext()) {
		Student student=(Student) itr.next();
		System.out.println(student.rollno+" "+student.name+" "+student.age);
	}
	System.out.println("using enhanced for loop");
	for(Student st:listofstudent) {
		System.out.println(st.rollno);
		
		System.out.print(st.age);
		System.out.print(st.name);
	}
}
}
