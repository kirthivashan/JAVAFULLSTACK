package com.kirthi;

class Rectangle{
	int length;
	int breadth;
	
	Rectangle(int length,int breadth){
		this.length=length;
		this.breadth=breadth;
	}
	
	void area() {
		int result=length*breadth;
		System.out.println("Area of Rectangle: "+result);
	}
	void perimeter() {
		int result1=2*(length*breadth);
		System.out.println("Perimeter of Rectangle: "+result1);
	}
}
public class MyClass23 {

	public static void main(String[] args) {
		Rectangle obj=new Rectangle(10,20);
		obj.area();
		obj.perimeter();

	}

}
