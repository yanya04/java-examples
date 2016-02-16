package com.yyzz.java.examples.stream;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainIntermediate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> s = Stream.of("Alice", "Bob", "Carol");
		
		Consumer<Object> println = System.out::println;
		
		s.filter(x -> x.contains("i")).forEach(println);
		
		println.accept("====");
		s = Stream.of("Alice", "Bob", "Carol", "Bob");
		s.distinct().forEach(println);
		
		Stream<Integer> nums = Stream.iterate(1, n -> n + 1);
		nums.skip(20).limit(4).forEach(println);
		
		println.accept("====");
		s = Stream.of("Alice", "Bob", "Carol", "Bob");
		s.map(String::length).forEach(println);
		
		println.accept("====");
		s = Stream.of("Alice", "Bob", "Carol", "Bob");
		s.sorted(Comparator.reverseOrder()).forEach(println);
		
		println.accept("====");
		s = Stream.of("Alice", "Bob", "Carol", "Bob");
		//println.accept(s.collect(Collectors.joining(",")));
		println.accept(s.collect(Collectors.toCollection(LinkedList::new)));
		
		println.accept("====");
		s = Stream.of("Alice", "Bob", "Carol", "Dave");
		//println.accept(s.collect(Collectors.joining(",")));
		println.accept(s.collect(Collectors.toMap(String::length, k -> k, (s1, s2) -> s1 + "," + s2)));

		
		println.accept("====");
		s = Stream.of("Alice", "Bob", "Carol", "Dave");
		
		Map<Boolean, List<String>> groupBy = s.collect(Collectors.groupingBy(x -> x.contains("a")));
		System.out.println(groupBy);
	}
	
	

}
