package com.yyzz.java.examples.collections;

import java.util.TreeSet;

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
		
		System.out.println(y - x);
	}

}
