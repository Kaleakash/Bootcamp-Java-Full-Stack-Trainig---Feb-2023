package com;

public class ThrowsException {
	static void dis1() throws ArithmeticException{
		try {
		int a=10/1;
		}catch(NumberFormatException e) {
			
		}
		System.out.println("This is dis1 method");
	}
	static void dis2() throws ArrayIndexOutOfBoundsException{
		try {
		dis1();
		}catch(ArithmeticException e) {}
		System.out.println("This is dis2 method");
	}
	public static void main(String[] args)throws Exception {
		//try {
		dis2();
		//}catch(Exception e) {}
		System.out.println("main method");
	}

}
