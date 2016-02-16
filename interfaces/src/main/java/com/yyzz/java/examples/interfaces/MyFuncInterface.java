package com.yyzz.java.examples.interfaces;

@FunctionalInterface
public interface MyFuncInterface {
	
	public static boolean kick(){
		return false;
	}

	public <T> T accept();
	
	public default <T> boolean test(T a){
		return a.equals(a);
	}
}
