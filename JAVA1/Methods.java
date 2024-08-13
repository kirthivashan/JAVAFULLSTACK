package com.kirthi;

public class Methods {

		void MyMethod1() {
			System.out.println("Instance of object method");
		}
		
		static void MyMethod2() {
			System.out.println("static or class method");
		}
		
		public static void main(String args[]) {
			Methods m=new Methods();
			m.MyMethod1();
			
			Methods.MyMethod2();
		}


}
