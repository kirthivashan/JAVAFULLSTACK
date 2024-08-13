package com.kirthi;

class Employee1{
	String name;
	String job;
	int da;
	int pa;
	int ma;
	int basicSalary;
	int totalSalary;
	
	Employee1(String name,String job,int da,int pa,int ma,int basicSalary,int totalSalary){
		this.name=name;
		this.job=job;
		this.da=da;
		this.pa=pa;
		this.ma=ma;
		this.basicSalary=basicSalary;
		this.totalSalary=totalSalary;
	}
	
	void calculate() {
		 totalSalary=da+pa+ma+basicSalary;
	}
	void display() {
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Job:"+job);
		System.out.println("Net Salary:"+totalSalary);
	}
}
public class MyClass26 {

	public static void main(String[] args) {
		Employee1 obj=new Employee1("kirthi","SD",5000,4000,3000,45000,0);
		obj.calculate();
		obj.display();

	}

}
