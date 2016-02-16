package com.yyzz.java.examples.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		
		/*
		// Callable
		Future<Integer> fu = executor.submit(() -> {
			
			System.out.println("ss1");
			if(10 > 9){
				throw new Exception("x");
			}
			return 15;
			});
		
		Future<?> fu2 = executor.submit(() -> {
			
			System.out.println("ss2");
			if(10 > 9){
				try {
					throw new Exception("x");
				} catch (Exception e) {
				}
			}
			});
		
		executor.shutdown();
		
		
		System.out.println(fu.get());
		System.out.println(fu2.get());*/
		
		
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(() -> {
			System.out.println("a");
		}, 0, 1, TimeUnit.SECONDS);
		Future<?> result = service.submit(() -> System.out.println("b"));
		
		System.out.println(result.get());
		
	}

}
