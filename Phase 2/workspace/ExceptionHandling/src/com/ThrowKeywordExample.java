package com;
class MyException extends Exception{
	public MyException() {
		super();		// it call super class empty constructor 
	}
	public MyException(String msg) {
		//super();		// it call super class emptry constructor 
		super(msg);			// we are calling super class parameter constructor to set the message 
	}
}
public class ThrowKeywordExample {

	public static void main(String[] args) {
	int age=19;
	try {
		if(age<21) {
			//throw new Exception();	// pre defined generic exception 
			//throw new ArithmeticException();  // pre defined specific exception 
		//int a=10/0;
			//throw new ArithmeticException("age must be > 21");
			//throw new MyException();
			throw new MyException("age must be > 21");
		}else {
			System.out.println("You can vote!");
		}
		
	}catch (Exception e) {
		System.out.println(e.toString());
	}

	}

}
