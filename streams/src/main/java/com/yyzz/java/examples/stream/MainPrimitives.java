package com.yyzz.java.examples.stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainPrimitives {
	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1,2,3);
		OptionalDouble od = stream.mapToInt(x -> x).average();
		System.out.println(od.getAsDouble());
		
		IntStream intStream = IntStream.of(1,3,4);
		System.out.println(intStream.average().getAsDouble());
	}
}
