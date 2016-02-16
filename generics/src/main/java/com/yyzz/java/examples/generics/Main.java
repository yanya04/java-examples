package com.yyzz.java.examples.generics;

import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		class Hello<T>{
			T t;
			Hello(T t){
				this.t = t;
			}
			public String toString(){
				return t.toString();
			}
		}
		
		new Hello<String>("hello");
		new Hello(1).toString();
		
		TreeSet<String> tree = new TreeSet<>();
		tree.add("ONE");
		tree.add("One");
		tree.add("one");
		
		tree.forEach((s) -> System.out.println("x" + s));
		
		System.out.println(tree);
		System.out.println(tree.ceiling("On"));
		tree.add("On");
		System.out.println(tree);
	}

	public static <T> T identify(T a){
		return a;
	}
}
