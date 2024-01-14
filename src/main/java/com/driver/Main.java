package com.driver;

public class A {
	
	public String meth() {
		  return "Invoking method from class A";
	}

}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B objB = new B();
		 
		 System.out.println(objB.meth());

	}

}
