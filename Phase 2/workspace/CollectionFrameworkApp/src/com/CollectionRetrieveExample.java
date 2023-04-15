package com;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class CollectionRetrieveExample {

	public static void main(String[] args) {
//	HashSet hs = new HashSet();
//	hs.add(3); hs.add(1); hs.add(5); hs.add("Ravi");
//	System.out.println(hs);
//	System.out.println("For each loop");
//	for(Object a:hs) {
//		System.out.println(a);		
//	}
//	System.out.println("Iterator loop");
//	Iterator ii	 = hs.iterator();
//	while(ii.hasNext()) {
//		Object obj = ii.next();
//		if(obj.equals(5)) {
//			ii.remove();
//		}
//		System.out.println(obj);
//	}
//	System.out.println(hs);
//	ArrayList al = new ArrayList();
//	al.add(30); al.add(10); al.add(50);
//	// we can use for each loop 
//	// we can use iterator 	: only forward direction 
//	// we can use ListIterator : forward as well as backward direction 
//	ListIterator li = al.listIterator();
//	System.out.println("forward direction");
//	while(li.hasNext()) {
//		Object obj = li.next();
//		System.out.println(obj);
//	}
//	System.out.println("backward direction");
//	while(li.hasPrevious()) {
//		Object obj = li.previous();
//		System.out.println(obj);
//	}
		
	HashMap hm = new HashMap();	
		hm.put(1, "Steven");
		hm.put(2, "John");
		hm.put(3, "Leena");
//		for(Object obj :hm) {
//			
//		}
		Set ss = hm.entrySet();   // converting map to set 
		Iterator ii = ss.iterator();
		while(ii.hasNext()) {
			Object obj = ii.next();
			System.out.println(obj);
		}
	}

}





