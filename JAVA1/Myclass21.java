package com.kirthi;


class Person{
	String name;
	int age;
	
	Person(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Person Name: "+name);
		System.out.println("Person Age: "+age);
	}
}
public class Myclass21 {

	public static void main(String[] args) {
		Person obj=new Person("kirthi",21);
		obj.display();

	}

}
