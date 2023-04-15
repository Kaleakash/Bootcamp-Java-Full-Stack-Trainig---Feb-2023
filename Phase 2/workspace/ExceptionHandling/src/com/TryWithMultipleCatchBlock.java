package com;

public class TryWithMultipleCatchBlock {

	public static void main(String[] args) {
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		String s="a10";
		try {
		int res = a/b;
		System.out.println("Result is "+res);
		int res1 = abc[1]/1;
		System.out.println("Result is "+res1);
		System.out.println(Integer.parseInt(s)+10);
		}
		 catch (ArithmeticException e) {
			System.out.println("divided by zero "+e);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index "+e);
		}catch(Exception e) {
			System.out.println("Generic "+e);
		}
		System.out.println("Finish");
	}

}
