import { Component } from '@angular/core';
import { Employee } from './modal/Employee';
import { EmployeeserviceService } from './employeeservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'EMPLOYEE';
    emplyoee: Employee ;
    result:string;
    employeeArr:Employee[];
    flag:boolean;


   constructor(private service:EmployeeserviceService){
    this.emplyoee=new Employee();
    this.result="";
    this.employeeArr=[];
    this.flag=false;
   }
  insertEmployee(data:any){
      this.emplyoee.id=data.bookId;
      this.emplyoee.bookName=data.bookName;
      this.emplyoee.bookAuthor=data.bookAuthor;
      this.result=this.service.insertEmployee(this.emplyoee);
  }
  updateEmployee(data:any){
    this.emplyoee.id=data.empId;
    this.emplyoee.bookName=data.empName;
    this.emplyoee.bookAuthor=data.empSalary;
    this.result=this.service.updateEmployee(this.emplyoee);
}
deleteEmployee(data:any)
{
  this.result=this.service.deleteEmployee(data.empId);
}
findEmployee(data:any){
  this.emplyoee=this.service.findEmployee(data.empId);
  this.result=this.emplyoee.id+" "+this.emplyoee.bookName+" "+this.emplyoee.bookAuthor;
}
findAllEmployee(){
  this.employeeArr=this.service.findAllEmployee();
  this.flag=true;
  
}
}
