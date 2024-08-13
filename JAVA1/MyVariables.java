package com.kirthi;

public class MyVariables {
	
	int b=20;
	static int c=30;

	public static void main(String[] args) {
		int a=10;
		System.out.println("Local variable:"+a);
		
		MyVariables vb=new MyVariables();
		System.out.println(vb.b);
		
		System.out.println(MyVariables.c);
	}

}
