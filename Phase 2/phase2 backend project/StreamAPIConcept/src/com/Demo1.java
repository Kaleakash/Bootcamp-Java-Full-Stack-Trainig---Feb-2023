package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
//class MyConsumer implements Consumer<String>{
//	@Override
//	public void accept(String name) {
//		System.out.print(" "+name);
//	}
//}
public class Demo1 {
	public static void main(String[] args) {
	List<String> names = new ArrayList<String>();	
	names.add("Steven"); names.add("Ajay"); names.add("Vijay");
	names.add("Lex"); names.add("Seeta"); names.add("Reeta");
//	Iterator<String> li = names.iterator();
//	while(li.hasNext()) {
//		String name = li.next();
//		System.out.print(" "+name);
//	}
//	System.out.println(" ");
//	Consumer<String> cc = new MyConsumer();
//	names.forEach(cc);
//	System.out.println(" ");
	System.out.println(" Using lambd expression");
	names.forEach(v->System.out.print(" "+v));
	}

}
