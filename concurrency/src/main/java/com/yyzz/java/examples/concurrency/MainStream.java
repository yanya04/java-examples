package com.yyzz.java.examples.concurrency;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStream {

	
	
	private static Integer process(Integer a){
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {
		}
		return a;
	}
	
	private static void processAll(List<Integer> data){
		data.parallelStream().map(a -> process(a)).count();
	}
	
	
	public static void main(String[] atrs){
		List<Integer> data = new ArrayList<>(2000); 
		for(int i = 0; i < 2000; i ++){
			data.add(i);
		}
		Instant start = Instant.now();
		processAll(data);
		Instant end = Instant.now();
		System.out.println(Duration.between(start, end));
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		
	}
}
