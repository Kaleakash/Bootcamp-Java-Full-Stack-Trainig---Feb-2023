package com;
interface A {
	void dis1();
	//void dis5();
	default void dis2() {
		System.out.println("This is interface with default implementation");
	}
	default void dis3() {
		System.out.println("This is interface with default implementation");
	}
	static void dis4() {
		System.out.println("This is interface with static method implementation");
	}
}
class B implements A {
	public void dis1() {
		System.out.println("A interface abstract method implementation");
	}
	public void dis3() {
		System.out.println("dis3 default method override by B class");
	}
}
public class Java8InterfaceConcept {
	public static void main(String[] args) {
		B obj1 = new B();
		obj1.dis1();
		obj1.dis2();
		obj1.dis3();
		A.dis4();
	}

}
