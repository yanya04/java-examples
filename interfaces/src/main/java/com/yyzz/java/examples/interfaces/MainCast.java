package com.yyzz.java.examples.interfaces;

import java.util.LinkedList;
import java.util.List;

public class MainCast {
	
	
	static class A{};
	static class B extends A{};
	static class C extends B{};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<A> strs = new LinkedList<>();
		strs.add(new A());
		List<B> objs = new LinkedList<>();
		
		addSound(strs);
		addSound(objs);
		
		List<? extends B> list1 = new LinkedList<B>();
		List<? extends B> iist2 = new LinkedList<C>();
		List<? super B> list3 = new LinkedList<A>();
		List<? super B> list4 = new LinkedList<B>();
	}
	
	private static void addSound2(List<? extends B> list){
	}
	
	private static void addSound(List<? super B> list){
		list.add(new B());
		list.add(new C());
	}

}
