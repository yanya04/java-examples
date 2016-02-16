package com.yyzz.java.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays.asList(1,2,3,4,5).stream().forEach(System.out::print);
		
		Arrays.asList(1,2,3,4,5).parallelStream().forEach(System.out::print);
		System.out.println("====");
		System.out.println(Arrays.asList(1,2,3,4,5).stream().map(i -> i * i));
		
		System.out.println("====");
		
		Stream<String> stream = Stream.generate(() -> "grow");
		
		IntStream is = IntStream.empty();
		
		OptionalDouble op = is.average();
		
		op.ifPresent(System.out::println);
		
		Stream.generate(() -> "1")
		.filter(x -> x.length() > 0)
		.limit(2);
		
		Stream.iterate(1,  x-> ++x).limit(5).map(x -> "" + x).collect(Collectors.joining());
		
		
		List<Integer> l1 = Arrays.asList(1,2,3);
		List<Integer> l2 = Arrays.asList(4,5,6);
		List<Integer> l3 = Arrays.asList();
		
		Stream.of(l1,l2,l3).flatMap(x -> x.stream()).forEach(System.out::println);
		
		
		
		Stream<Integer> s2 = Stream.of(1);
		IntStream is2 = s2.mapToInt(x -> x);
		//DoubleStream ds2 = s2.mapToDouble(x -> x);
//		Stream<Integer> s3 = ds2.mapToInt(x -> x);
		
		Stream<String> sx1 = Stream.empty();
		Stream<String> sx2 = Stream.empty();
		
		Map<Boolean, List<String>> partitionMap =
		sx1.collect(Collectors.partitioningBy(xx -> xx.startsWith("a")));
		Map<Boolean, List<String>> groupingMap =
		sx2.collect(Collectors.groupingBy(xy -> xy.startsWith("a")));
		
		System.out.println(partitionMap);
		System.out.println(groupingMap);
		
		
		IntStream.range(1, 6).forEach(System.out::println);
		
		Stream<String> strmmm = Stream.iterate("-", s -> s + s);
		boolean b1 = strmmm.noneMatch(s -> s.length() > 0);
		
		
		System.out.println(b1);
		
		Stream.generate(() -> "1").filter(z -> z.length() > 0).limit(10).forEach(System.out::println);
		
		
	}

}
