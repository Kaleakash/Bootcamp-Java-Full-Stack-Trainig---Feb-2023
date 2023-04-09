package com;
interface Abc {
	//public static final int a=10;
	int a=10;
	//public abstract void dis1();
	void dis1();
}
interface Xyz {
	int b=20;
	void dis2();
}
interface Mno extends Abc,Xyz{		
	int c=30;
	void dis3();
}
class Demo implements Abc,Xyz {
	public void dis1() {
		System.out.println("This abc interface method");
	}
	public void dis2() {
		System.out.println("This is xyz interfae method");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		Demo obj = new Demo();
		obj.dis1();
		obj.dis2();
	}

}
