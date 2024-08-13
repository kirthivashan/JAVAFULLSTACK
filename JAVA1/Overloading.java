package com.kirthi;

public class Overloading {
	
	void myMethod(String name) {
		System.out.println("Welcome "+name);
	}
	void myMethod(int a,int b) {
		System.out.println("Addition: "+(a+b));
	}
	void myMethod(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		System.out.println("Factorial:"+fact);
	}

	public static void main(String[] args) {
		Overloading  obj=new Overloading();
		obj.myMethod("kirthi");
		obj.myMethod(10,20);
		obj.myMethod(5);
	}

}
