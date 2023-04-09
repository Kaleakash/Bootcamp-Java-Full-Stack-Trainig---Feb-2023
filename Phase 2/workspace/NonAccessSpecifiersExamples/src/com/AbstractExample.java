package com;
abstract class Bike {
	abstract void speed();
}

abstract class Pulsar extends Bike {					// overriding 
	void color() {
		System.out.println("Black");
	}
	abstract void mailage();
}
class SuperPulsar extends Pulsar {
	void speed() {
		
	}
	void mailage() {
	
	}
}
public class AbstractExample {
	public static void main(String[] args) {
		
	}

}
