package com.yyzz.java.examples.concurrency;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MainConcurrentMap {

	public static void main(String[] args) throws Exception
	{
		Map<String, Integer> map1 = new ConcurrentHashMap<>();
		map1.put("a", 1);
		map1.put("b", 2);
		
		Map<String, Integer> map2 = Collections.synchronizedMap(new HashMap<>());
		map2.put("a", 1);
		map2.put("b", 2);
		
		for(String key : map1.keySet()){
			System.out.println(key);
			map1.put("c", 3);
		}
		for(String key : map2.keySet()){
			System.out.println(key);
			map2.put("c", 3);
		}
	}
}
