package com.yyzz.java.examples.stream;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainTerminate {

	
	public static void main(String[] args){
		
		Stream<String> s = Stream.of("Alice", "Bob", "Carol");
		Optional<String> min = s.min((s1,s2) -> s1.length() - s2.length());
		min.ifPresent(System.out::println);
		
		Stream<Double> randoms = Stream.generate(Math::random);
		
		Optional<Double> op = randoms.findAny();
		op.ifPresent(System.out::println);
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		Consumer<Object> println = System.out::println;
		
		s = Stream.of("Alice", "Bob", "Carol");
		println.accept(s.allMatch(pred));
		
		Stream<Integer> ints = Stream.of(3,5,10);
		Integer result = ints.reduce(1, (a, b) -> a * b);
		System.out.println(result);
		
		
		Stream<String> stream = Stream.of("b","a", "c", "d");
		TreeSet<String> set  = stream.collect(TreeSet::new, TreeSet::add, TreeSet::addAll);
		
		println.accept(set);
		stream = Stream.of("b","a", "x", "d");
		
		Set<String> set2 = stream.collect(Collectors.toCollection(TreeSet::new));
		
		println.accept(set2);
	}
}
