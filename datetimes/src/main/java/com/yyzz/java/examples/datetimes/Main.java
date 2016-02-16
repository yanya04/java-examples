package com.yyzz.java.examples.datetimes;

import java.io.Closeable;
import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duration duration = Duration.ofDays(7200);
		System.out.println(duration);
		
		System.out.println(Duration.of(5, ChronoUnit.HALF_DAYS));
		
		System.out.println(Duration.of(1, ChronoUnit.DAYS));

		
		LocalTime t1 = LocalTime.of(12, 05);
		LocalTime t2 = LocalTime.of(15, 05);
		
		System.out.println(ChronoUnit.MINUTES.between(t1, t2));
		
		Instant inst = Instant.now();
		Instant instant2 = inst.plus(1999, ChronoUnit.DAYS);
		System.out.println(instant2);
		
		
		class A implements AutoCloseable{
			public void close() throws Exception {
			}
		}
		class B implements Closeable{

			public void close() throws IOException {
				
			}
		}
		
		try(A a = new A(); B b = new B();){
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
