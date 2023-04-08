package com;

public class Car {
	
	int wheel;
	String color;
	float amount;
	
	void start() {
		System.out.println("Car start");
	}
	void appliedGear() {
		System.out.println("Applied Gear");
	}
	void moving() {
		System.out.println("Car is moving");
	}
	void stop() {
		System.out.println("Car stop");
	}
	
	void displayCarDetails(String name) {
		System.out.println("Name of the car "+name);
		System.out.println("wheel "+wheel);
		System.out.println("color "+color);
		System.out.println("amount "+amount);
	}
}
