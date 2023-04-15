package com;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class SetDemo {
	public static void main(String[] args) {
		// HashSet 
//		HashSet hs = new HashSet();
//		System.out.println("size "+hs.size());
//		hs.add(10);// before storing they are primitive but 
//						// once store it automatically convert to object 
//						// auto-boxing : converting primitive to object. 
//		int a=20;
//		Integer b = new Integer(a);
//		hs.add(b);
//		hs.add(10.20);
//		hs.add(true);
//		hs.add("Steven");
//		System.out.println(hs);
//		System.out.println("size "+hs.size());
//		HashSet hs = new HashSet();
//		hs.add(3);
//		hs.add(1);
//		hs.add(10);
//		hs.add("John");
//		hs.add(4);
//		hs.add(8);
//		hs.add(7);
//		System.out.println(hs);
//		hs.remove(3);
//		System.out.println(hs);
//		System.out.println(hs.contains(1));
//		System.out.println(hs.contains(100));
		//HashSet hs = new HashSet();		// unorder 
		//LinkedHashSet hs = new LinkedHashSet(); // order 
		TreeSet hs = new TreeSet(); // sorted by default asc 
		hs.add(3);
		hs.add(1);
		hs.add(10);
		hs.add(10);
		//hs.add("John");
		hs.add(4);
		hs.add(8);
		hs.add(7);
		System.out.println(hs);
	}

}
