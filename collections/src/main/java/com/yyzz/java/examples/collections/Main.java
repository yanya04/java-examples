package com.yyzz.java.examples.collections;

import java.time.ZoneId;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeSet;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("one");
		tree.add("One");
		tree.add("ONE");
		
		System.out.println(tree.lower("On"));
		System.out.println(tree.higher("On"));
		
		Integer x = new Integer(1);
		
		Integer y = new Integer(2);
		
		System.out.println(ZoneId.systemDefault());
		
		
		
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(1);
		queue.add(2);
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		
		Deque<Integer> deque = new ArrayDeque<>();
		
		deque.offer(1);
		deque.push(2);
		System.out.println(deque);
		System.out.println(deque.pop());
		System.out.println(deque.peek());
		
		
		Map<String, Integer> map = new HashMap<>();
		Consumer<Object> println = System.out::println;
		map.put(null, null);
		println.accept(map);
		
		map.putIfAbsent(null, 1);
		println.accept(map);
		
		map.putIfAbsent(null, 2);
		println.accept(map);
		
		BiFunction<Integer, Integer, Integer> mapper = (v1, v2) -> v1 + v2;
		
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("A", 1);
		map2.put("B", 2);
		println.accept("=================");
		map2.merge("A", 5,mapper);
		map2.merge("B", 6, mapper);
		println.accept(map2);
		
		List list = new LinkedList();
		list.add("a");
		list.add("b");
		list.add(1);
		for(Object s: list){
			
		}
		println.accept(list);
		
		
		Queue<Integer> deque2 = new ArrayDeque<>();
		deque2.add(3);
		deque2.add(4);
		deque2.add(5);
		deque2.add(6);
		
		System.out.println(deque2);
		deque2.remove(0);
		deque2.remove(3);
		System.out.println(deque2);
		
		Map wildMap = new HashMap();
		wildMap.put(124, "asd");
		wildMap.put("aa", 11);
		System.out.println(wildMap.containsKey(new Long(124)));
		
		
		
	}

}
