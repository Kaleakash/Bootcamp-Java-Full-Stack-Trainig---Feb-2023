package com;
final class Bank {
	final void withdraw() {
		System.out.println("Withdraw logic");
	}
}
//class Hsbc extends Bank {
////	@Override
////	void withdraw() {
////		System.out.println("Withdraw logic provided by HSBC");
////	}
//}
public class FinalExample {

	public static void main(String[] args) {
		final int A=10;
		//A=20;
//		Hsbc hsbc = new Hsbc();
//		hsbc.withdraw();
	}

}
