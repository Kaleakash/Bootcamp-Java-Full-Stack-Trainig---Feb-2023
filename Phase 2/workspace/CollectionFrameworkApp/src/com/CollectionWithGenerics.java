package com;

import java.util.ArrayList;

public class CollectionWithGenerics {

	public static void main(String[] args) {
	// colletion framework without generics 
//	ArrayList al = new ArrayList();
//	al.add(10);				// auto-boxing : converted into object 
//	al.add(10.20);
//	al.add("Ravi");
//	al.add(true);
//	
////	Object obj = al.get(1);
////	Integer i = (Integer)obj;			// down level type casting 
////	int n = i.intValue();
////	System.out.println(n);
//	
//	Object obj = al.get(1);
//	Double i = (Double)obj;			// down level type casting 
//	double n = i.doubleValue();
//	System.out.println(n);
		
		// collection framework with generics 
		//ArrayList<Type> al = new ArrayList<Type>();
		// Type can be Integer, Float, Double, String, Employee, Customer, Product 
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		
		int n = al.get(0);  // auto-unboxing : converting object to primitive 
		System.out.println(n);
		
	}

}
