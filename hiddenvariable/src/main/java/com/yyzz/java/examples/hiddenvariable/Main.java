package com.yyzz.java.examples.hiddenvariable;


interface A{
	// hidden variable
	int hidden = 4;
	static int num = 1;
	
	// hidden method
	default int cal(){
		return 1;
	}
	
}

abstract class B implements A{
	// hidden variable
	int hidden = 5;
	static int num = 2;
	
	private int hide(){
		return 1;
	}
	
	
	// method override
	public int cal(){
		System.out.println(hide());
		return 2;
	}
}

class C extends B{
	
	int hidden = 6;
	static int num = 3;
	
	private int hide(){
		return 2;
	}
	
	// method override
	public int cal(){
		
		System.out.println(hide());
		return 3;
	}
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		System.out.println(c.hidden + " " + c.num + " " + c.cal());
		
		B b = c;
		System.out.println(b.hidden + " " + b.num + " " + b.cal());
		
		A a = c;
		System.out.println(a.hidden + " " + a.num + " " + a.cal());
	}

}
