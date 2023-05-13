package com;

import java.util.function.Function;
import java.util.function.Predicate;

class MyFunction implements Function<Integer, String>{
	@Override
	public String apply(Integer t) {
		// logic or coding.... 
		return "The value is "+t;
	}
}
class MyPredicate implements Predicate<Double>{
	@Override
	public boolean test(Double t) {
		// TODO Auto-generated method stub
		return false;
	}
}
public class PreDefinedFunctionalnterfaceExample {
	public static void main(String[] args) {
		// without lambda expression 
		Function<Integer, String> f1 = new MyFunction();
		System.out.println(" "+f1.apply(10));
		
		// with lambda expression 
		
		Function<Integer, String> f2 = (t)->"The value is "+t;
		
		System.out.println(" "+f2.apply(20));
	}

}
