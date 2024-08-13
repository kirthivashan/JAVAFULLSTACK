package com.kirthi;

class Book{
	String title;
	String author;
	int ISBN;
	
	Book(String title,String author,int ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	
	void display() {
		System.out.println("Book Title:"+title);
		System.out.println("Book Author:"+author);
		System.out.println("ISBN Number:"+ISBN);
	}
}
public class MyClass25 {

	public static void main(String[] args) {
		Book b=new Book("JAVA","GOSLING",87654);
		b.display();

	}

}
