package com.masai.oopsapplication;

public class Square extends Shape {

	private double side;
	
	public Square(String name,double side) {
		// TODO Auto-generated constructor stub
		super(name);
		this.side=side;
	}
	
	public double getSide() {
		return side;
	}
	
	public void setSide(double side) {
		this.side=side;
	}
	@Override
	public double area() {
		return side*side;
	}

}
