package com.yyzz.java.examples.concurrency;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MainCyclicBarrier {

	private void task1(){System.out.println("task-1");}
	private void task2(){System.out.println("task-2");}
	private void task3(){System.out.println("task-3");}

	private void performTask(CyclicBarrier c1, CyclicBarrier c2){
		
		try {
			task1();
			task2();
			c1.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
		task3();
		try {
			c2.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newFixedThreadPool(4);
		CyclicBarrier c1 = new CyclicBarrier(4);
		CyclicBarrier c2 = new CyclicBarrier(4, () -> System.out.println("init-done"));
		MainCyclicBarrier manager = new MainCyclicBarrier();
		for(int i = 0; i< 16; i ++){
			service.submit(() -> manager.performTask(c1,c2));
		}
		service.shutdown();
		service.awaitTermination(100, TimeUnit.DAYS);

	}

}
