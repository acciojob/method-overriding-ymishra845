package com.driver;

public class A {
	
	public String meth() {
		  return "Invoking method from class A";
	}

}
public class B extends A {

	@Override
	public String meth() {
		// TODO Auto-generated method stub
		System.out.println(super.meth());
		return  "Method is overridden in Extendend class B";
	}
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 B objB = new B();
		 
		 System.out.println(objB.meth());

	}

}
