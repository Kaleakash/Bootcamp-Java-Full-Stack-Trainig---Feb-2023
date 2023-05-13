package com;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {

	public static void main(String[] args) {
//		Pattern p = Pattern.compile("java");
//		Matcher m  = p.matcher("java");
//		
////		if(m.matches()) {
////			System.out.println("Yes");
////		}else {
////			System.out.println("No");
////		}
//		while(m.find()) {
//			System.out.println("Yes");
//		}
		
		Pattern p = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
		Matcher m  = p.matcher("Welcome to java Training, We are learning java");
		while(m.find()) {
			System.out.println("Yes");
			System.out.println(m.start()+" "+m.end());
		}
	}

}
