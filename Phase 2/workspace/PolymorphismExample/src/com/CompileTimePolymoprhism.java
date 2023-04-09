package com;
class Operation {
	void abc() {
		
	}
	void dis() {
		
	}
	void add() {
		
	}
	void info() {
		
	}
}
class AreaDetails {
	public void area(int r) {
		
	}
	public void area(int l, int b) {
		
	}
	public void area(float l, float b) {
		
	}
}
public class CompileTimePolymoprhism {

	public static void main(String[] args) {
		AreaDetails ad = new AreaDetails();
		ad.area(20);
		ad.area(4, 6);
	}

}
