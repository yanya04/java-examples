package com.yyzz.java.examples.lambda;

import java.math.BigInteger;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class MainFunction {
	
	public static String tricat(String a, String b, String c){
		return a + b + c;
	}
	

	public static void main(String[] args) {
		
		Consumer<Object> println = System.out::println;
		
		// TODO Auto-generated method stub
		Function<String, Integer> f1 = String::length;
		println.accept(f1.apply("tests"));
		
		BiFunction<String, String, String> f2 = String::concat;
		
		println.accept(f2.apply("a", "b"));
		
		
		TriFunction<String, String, String, String> trF = MainFunction::tricat;
		println.accept(trF.apply("a", "b", "c"));
		
		UnaryOperator<String> u1 = String::toUpperCase;
		println.accept(u1.apply("abc"));
		
		BinaryOperator<BigInteger> b1 = BigInteger::add;
		
		println.accept(b1.apply(new BigInteger("1"), new BigInteger("2")));

	}

}
