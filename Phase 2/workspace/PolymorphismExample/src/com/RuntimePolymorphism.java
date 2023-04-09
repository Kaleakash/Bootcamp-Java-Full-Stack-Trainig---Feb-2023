package com;
class Bike {
		void speed() {
			System.out.println("60km/hr");
		}
}
class Pulsar extends Bike {					// overriding 
	void color() {
		System.out.println("Black");
	}
	void speed() {
		System.out.println("90km/hr");
	}
}
class Honda extends Bike {					// re-usability 
	void color() {
		System.out.println("Gray");
	}
}
class Tvs extends Bike {						// merge the code 
	void color() {
		System.out.println("Red");
	}
	void speed() {
		super.speed();     // calling super class speed logic
		System.out.println("20km/hr");
	}
}
public class RuntimePolymorphism {
	public static void main(String[] args) {
	Pulsar pu = new Pulsar();
	Honda hh = new Honda();
	Tvs tv = new Tvs();
	pu.color();   pu.speed();
	hh.color();    hh.speed();
	tv.color();    tv.speed();
	}

}
