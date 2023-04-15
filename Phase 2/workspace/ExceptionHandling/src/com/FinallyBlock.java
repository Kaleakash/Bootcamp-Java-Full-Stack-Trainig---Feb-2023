package com;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("hi");
		try {
			int res =10/1;
			System.out.println("res "+res);
		} catch (Exception e) {
			System.out.println("catch block");
		}finally {
			System.out.println("finally block");
		}
		System.out.println("normal statements");
	}

}
