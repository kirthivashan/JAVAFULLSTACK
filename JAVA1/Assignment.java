package com.kirthi;

import java.util.Scanner;

class Student{
	
	int registrationNumber;
	String studentName;
	int []arr=new int[5];
	
	Student(int registrationNumber,String studentName) {
		this.registrationNumber=registrationNumber;
		this.studentName=studentName;
	}
	void getMarks() {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
	}
	void displayGrade() {
		int sum=0;
		int avg=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		avg=sum/arr.length;
		
		System.out.println("Student Number:"+registrationNumber);
		System.out.println("Student Name:"+studentName);
		System.out.println("Student Total Marks:"+sum);
		System.out.println("Average Marks:"+avg);
		if(avg>90) {
			System.out.println("Grade : O Grade");
		}else if(avg>80) {
			System.out.println("Grade : A+ Grade");
		}else if(avg>70) {
			System.out.println("Grade : A Grade");
		}
		
	}
	
}

public class Assignment {

	public static void main(String args[]) {
		
		Student s=new Student(101,"kirthi");
		s.getMarks();
		s.displayGrade();		
	}

}
