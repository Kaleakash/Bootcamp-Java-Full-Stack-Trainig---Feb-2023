package xyz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

interface A {
	void dis1();
	
}
class B implements A {
	//@Override
	public void dis1() {
		System.out.println("A class dis1 method - override method by B class ");
	}
	void dis2() {
		System.out.println("B class dis2 method");
	}
	
}
class Abc {
	public List<String> getInfo() {
		// ArrayList, LinkedList, Vector 
		//List<String> ss = new ArrayList<>();
		List<String> ss = new LinkedList<>();
		return ss;
	}
	public ArrayList<String> getInfoDetails() {
		
		return null;
	}
}
public class Demo3 {
	public static void main(String[] args) {
		//A obj1 = new A();
		B obj2 = new B();		obj2.dis1();  obj2.dis2();
		
		A obj3 = new B();	// sub class object and super class reference super class can be 
							// interface. 
		obj3.dis1();
		//obj3.dis2();
		Set ss1 = new HashSet<>();
		List ll1 = new ArrayList<>();
		List ll2 = new LinkedList<>();
	}
}








