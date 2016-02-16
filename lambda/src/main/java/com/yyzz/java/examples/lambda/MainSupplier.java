package com.yyzz.java.examples.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Supplier;

public class MainSupplier {

	public static void main(String args[]){
		
		Supplier<LocalDate> s1 = LocalDate::now;
		Supplier<LocalDate> s2 = () -> LocalDate.now();
		
		System.out.println(s1.get());
		System.out.println(s2.get());
		
		Supplier<StringBuilder> builder =StringBuilder::new;
		
		StringBuilder sb1 = builder.get();
		StringBuilder sb2 = builder.get();
		
		System.out.println(sb1);
		
		Supplier<ArrayList<String>> alBuilder1 = ArrayList<String>::new;
		Supplier<ArrayList<String>> alBuilder2 = () -> new ArrayList<String>();
		
		ArrayList<String> al = alBuilder1.get();
		System.out.println(alBuilder1);
		
		
	}
}
