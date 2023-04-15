package com;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		//HashMap hm = new HashMap(); 				// unorder 
		//LinkedHashMap hm = new LinkedHashMap();		// order 
		TreeMap hm = new TreeMap();   // Asc key (sorting )
		hm.put(2, "Ravi");
		hm.put(1, "Ramesh");
		hm.put(5, "Steven");
		System.out.println(hm);
		hm.put(1, "John");
		hm.put(4, "Steven");
		hm.put(7,"B");
		System.out.println(hm);
		if(!hm.containsKey(8)) {
			hm.put(8, "Seeta");
		}
		System.out.println(hm);
		
	}

}
