package com.yyzz.java.examples.lambda;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MainPredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Predicate<String> empty1 = String::isEmpty;
		Predicate<String> empty2 = x -> x.isEmpty();
		System.out.println(empty1.test(""));
		System.out.println(empty2.test(""));
		
		BiPredicate<String,String> startsWith1 = String::startsWith;
		BiPredicate<String,String> startsWith2 = (x, y) -> x.startsWith(y);
		System.out.println(startsWith1.test("abc", "a"));
		System.out.println(startsWith2.test("abc", "a"));
		
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());
		
		System.out.println(brownEggs.test("mamaeggxxxbrown"));
		System.out.println(brownEggs.test("mamaeggxxxbroswn"));
		System.out.println(otherEggs.test("mamaeggxxxbrown"));
		System.out.println(otherEggs.test("mamaeggxxxbroswn"));
	}

}
