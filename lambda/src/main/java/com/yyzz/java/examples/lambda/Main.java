package com.yyzz.java.examples.lambda;

import java.util.Arrays;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		new Thread(() -> System.out.println("hello")).start();
		
		Thread.sleep(100);
		
		
		Integer[] numbers = new Integer[]{5, 4, 3, 7};
		Arrays.sort(numbers);
		System.out.println(Arrays.asList(numbers));
		Arrays.sort(numbers, (Integer i, Integer j) -> {
			if(i < j){
				return 1;
			} else if (i == j) {return 0;}
			else {
				return -1;
			}
		});
		System.out.println(Arrays.asList(numbers));
		
		Predicate<Integer> large = i -> i >= 5;
		
		for(Integer value : numbers){
			if(large.test(value)){
				System.out.println("large: " + value);
			}
		}

	}

}
