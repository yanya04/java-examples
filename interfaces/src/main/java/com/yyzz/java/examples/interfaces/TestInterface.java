package com.yyzz.java.examples.interfaces;

public interface TestInterface {

	public static int testCal(){
		return 1;
	}
	
	public default int test2Cal(){
		return 2;
	}
}
