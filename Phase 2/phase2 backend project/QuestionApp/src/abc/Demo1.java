package abc;
class A {
	void dis1() {
		System.out.println("A class dis1 method");
	}	
	void dis3() {
		System.out.println("this is a class dis3 method");
	}
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
public class Demo1 {
	public static void main(String[] args) {
//		A obj1 = new A();			obj1.dis1();
//		B obj2  = new B();			obj2.dis1(); 		obj2.dis2();
//		//B obj3 = new A();		// super class object and sub class reference not possible. 
//		A obj4 = new B();			// sub class object and super class reference possible. run time polymorphism 
//		obj4.dis1();  // 
//		//obj4.dis2();
//		B obj = new B();
//		obj.dis1();
		A obj = new B();
			obj.dis1();
		//obj.dis2();
			obj.dis3();
	}
}
