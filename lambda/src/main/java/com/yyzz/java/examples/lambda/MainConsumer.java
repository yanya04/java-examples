package com.yyzz.java.examples.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> println1 = System.out::println;
		Consumer<String> println2 = (x) -> System.out.println(x);
		
		println1.accept("hello");
		println2.accept("hello");
		
		Map<String, Integer> map = new HashMap<>();
		BiConsumer<String, Integer> map1 = map::put;
		BiConsumer<String, Integer> map2 = (key, value) -> map.put(key, value);
		
		map1.accept("a", 1);
		map2.accept("b", 2);
		
		System.out.println(map);

	}

}
