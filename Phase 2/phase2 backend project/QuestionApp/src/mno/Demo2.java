package mno;
abstract class A {
	abstract void dis1();
	
}
class B extends A {
	//@Override
	void dis1() {
		System.out.println("A class dis1 method - override method by B class ");
	}
	void dis2() {
		System.out.println("B class dis2 method");
	}
}
public class Demo2 {
	public static void main(String[] args) {
		//A obj1 = new A();
		B obj2 = new B();		obj2.dis1();  obj2.dis2();
		
		A obj3 = new B();	// sub class object and super class reference super class can be 
							// abstract class. 
		obj3.dis1();
		//obj3.dis2();
	}
}
