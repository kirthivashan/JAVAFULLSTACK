package com.kirthi;

public class This {
	
	String name;
	 
	This(String name){
		this(10,20);
		this.name=name;
		this.greeting();
	}
	
	This(int a,int b){
		System.out.println((a+b));
	}
	
	void greeting() {
		System.out.println("Welcome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This th=new This("kirthi");	

	}

}
