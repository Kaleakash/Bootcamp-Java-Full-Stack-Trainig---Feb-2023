package com;
class Abc {
	int a;			// instance variable 
	static int b;	// static variable 
	void dis1() {
		System.out.println("Non static method");
		System.out.println("a is "+a);
		System.out.println("b is "+b);
	}
	static void dis2() {
		System.out.println("Static method");
		//System.out.println("a "+a);
		System.out.println("b "+b);
	}
}
public class StaticExample {

	public static void main(String[] args) {
		Abc obj = new Abc();
		obj.dis1();
		Abc.dis2();    // static method 
		obj.dis2();
		
		obj.a=10;
		Abc.b=20;			// assign the value for static variable with help of class name
		obj.b=30;
		
	}

}
