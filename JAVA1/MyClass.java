package com.kirthi;

class Employee{
	int employeeid;
	String employeeName;
	float employeeSalary;
	
	Employee(int employeeid,String employeeName,float employeeSalary){
		this.employeeid=employeeid;
		this.employeeName=employeeName;
		this.employeeSalary=employeeSalary;
	}
	
	void display() {
		System.out.println("Employee Id:"+employeeid);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Employee Salary:"+employeeSalary);
		
	}
}
public class MyClass {

	public static void main(String[] args) {
		Employee emp1=new Employee(101,"kirthi",30000);
		emp1.display();

	}

}
