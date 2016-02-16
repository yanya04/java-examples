package com.yyzz.java.examples.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainAtomic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtomicLong v = new AtomicLong(0);
		
		final long[] v2 = {0};
		IntStream.iterate(1,  i -> 1).limit(100).parallel().forEach(i -> ++v2[0]);
		
		System.out.println(v2[0]);
		
		List<Integer> list = Arrays.asList(1,2,3);
		
		List<Integer> l2 = new CopyOnWriteArrayList<>(list);
		Set<Integer> s2 = new ConcurrentSkipListSet<>(list);
		for(Integer item : l2){
			l2.add(3);
		}
		for(Integer item : s2){
			s2.add(4);
		}
		System.out.println(l2 + " \n" + s2);
		
		System.out.println(Arrays.asList(1,2,3).stream().parallel().parallel().sorted().findAny().get());
		
		
		
		
		Stream<String> ss1 = Stream.of("a", "b", "c").parallel();
		Stream<String> ss2 = Stream.of("ba", "bb", "cb").parallel();
		
		Map<Boolean, List<String>> map = Stream.of(ss1, ss2).flatMap(s -> s).collect(Collectors.groupingBy(s -> ! s.startsWith("c")));
		System.out.println(map.get(false));
		
		
	}

}
