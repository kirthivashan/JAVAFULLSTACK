package com.kirthi;

public class Coverload {
	
	Coverload(String name){
		this(10,20);
		System.out.println("Welcome "+name);
	}
	Coverload(int a , int b){
		this(5);
		System.out.println("Addition:"+(a+b));
	}
	Coverload(int n){
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coverload c1=new Coverload("kirthi");
//		Coverload c2=new Coverload(10,20);
//		Coverload c3=new Coverload(5);

	}

}
