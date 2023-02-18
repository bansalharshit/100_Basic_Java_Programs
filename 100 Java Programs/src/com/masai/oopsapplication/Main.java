package com.masai.oopsapplication;

public class Main {
public static void main(String[] args) {
	Shape[] shapes=new Shape[2];
	shapes[0]=new Circle("Circle", 5.0);
	shapes[1]=new Square("Square",4.0);
	
	for(Shape sh:shapes) {
		System.out.println("Name Of Figure "+sh.getName());
		System.out.println("Area of "+sh.getName()+" "+sh.area());
	}
}
}
