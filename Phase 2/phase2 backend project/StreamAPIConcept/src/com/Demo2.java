package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();	
		names.add("Steven"); names.add("Ajay"); names.add("Vijay");
		names.add("Lex"); names.add("Seeta"); names.add("Reeta");
		names.add("Lex"); names.add("Steven"); 
//		Stream<String> ss = names.stream();			// converted list into stream 
//		ss.forEach(v->System.out.print(v+" "));     // forEach is terminal operator 
		
		//names.stream().forEach(v->System.out.print(v+" "));
		
		//names.stream().filter(v->v.contains("ee")).forEach(v->System.out.print(v+" "));
		//names.stream().filter(v->v.startsWith("S")).forEach(v->System.out.print(v+" "));
		
		///names.stream().map(v->v.toUpperCase()).forEach(v->System.out.print(v+" "));
		//System.out.println();
		//names.stream().forEach(v->System.out.print(v+" "));
		//names.stream().map(v->"Mr "+v).forEach(v->System.out.print(v+" "));
		
		//names.stream().distinct().forEach(v->System.out.print(v+" "));
		//names.stream().sorted().forEach(v->System.out.print(v+" "));
		//long value = names.stream().filter(v->v.contains("ee")).count();
		//System.out.println("Number of names are "+value);
		
//		Optional<String> op = names.stream().filter(v->v.contains("eee")).findAny();
//		if(op.isPresent()) {
//			System.out.println("Yes");
//		}else {
//			System.out.println("No");
//		}
		
		//List<String> upperCasename  = names.stream().map(v->v.toUpperCase()).collect(Collectors.toList());
//		
		//upperCasename.forEach(v->System.out.print(v+" "));
//		
//		
//		// we can write 10000 line code 
//		
//		
//		
//		
//		System.out.println(upperCasename);
		
//		Stream<String> ss = names.stream();
//		ss.forEach(v->System.out.print(v+" "));
//		System.out.println("Hi");
//		//ss.forEach(v->System.out.println(v+" "));
//		System.out.println(names);
//		System.out.println(names);
	}

}
