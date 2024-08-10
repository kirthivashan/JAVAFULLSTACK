import java.util.Scanner;

public class MyClass1{
 public static void main(String args[]){
 int employeeId;
 String employeeName;
 float employeeSalary;
 Scanner sc=new Scanner(System.in);
 employeeId = sc.nextInt();
 employeeName = sc.next();
 employeeSalary = sc.nextFloat();
 
 System.out.println("Enter employee id:"+employeeId);
 System.out.println("Enter employee name:"+employeeName);
 System.out.println("Enter employee salary:"+employeeSalary); 
}
}