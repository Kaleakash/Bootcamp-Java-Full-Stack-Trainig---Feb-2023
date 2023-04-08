package com;

public class CarTest {

	public static void main(String[] args) {
		
//	Car innova = new Car();		// car class object created...	
//		innova.start();
//		innova.appliedGear();
//		innova.moving();
//		innova.stop();
//		
//	Car bmw = new Car();
//	bmw.start();
//	bmw.stop();
		
		Car innova = new Car();
		innova.wheel=4;
		innova.color="Gray";
		innova.amount=3400000;
		innova.displayCarDetails("Innova");
		Car bmw = new Car();
		bmw.wheel=4;
		bmw.color="White";
		bmw.amount=20000000;
		bmw.displayCarDetails("BMW");
	}

}
