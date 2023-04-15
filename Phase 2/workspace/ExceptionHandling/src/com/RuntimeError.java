package com;

public class RuntimeError {

	public static void main(String[] args) {
		System.out.println("Hi");
		int a=10;
		int b=1;
		int abc[]= {10,20,30,40};
		String s="a10";
		try {
		int res = a/b;
		System.out.println("Result is "+res);
		int res1 = abc[0]/1;
		System.out.println("Result is "+res1);
		System.out.println(Integer.parseInt(s)+10);	// converting string to int
		}catch(Exception e) {
			//System.out.println("I Take Care!");
			//System.out.println(e.getMessage());// short message 
			//System.out.println(e.toString()); // name of the exception
			System.out.println(e); // internally call tostring method
		}
		System.out.println("Bye...");
		System.out.println("bye...");

	}

}
