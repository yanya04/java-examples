package com.yyzz.examples.modifiers;

import com.yyzz.examples.modifiers.another.SubClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Super su = new Super();
		System.out.println(su.a);

		SubClass su2 = new SubClass();
		System.out.println(su2.a);
		
		Integer i = 5;
		if(null instanceof Super){
			
		}
	}
	

}
