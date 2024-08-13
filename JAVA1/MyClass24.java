package com.kirthi;

import java.lang.Math;

class Circle{
	int radius;
	
	Circle(int r){
		this.radius=r;
	}
	
	void area() {
		double result=Math.PI*radius*radius;
		System.out.println("Area of Circle: "+result);
		
	}
	
	void circumference() {
		double result1=2*Math.PI*radius;
		System.out.println("Circumference of Circle: "+result1);
	}
}
public class MyClass24 {

	public static void main(String[] args) {
		Circle c=new Circle(5);
		c.area();
		c.circumference();

	}

}
