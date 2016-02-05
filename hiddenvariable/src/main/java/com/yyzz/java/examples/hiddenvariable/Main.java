package com.yyzz.java.examples.hiddenvariable;


interface A{
	// hidden variable
	int hidden = 4;
	static int num = 1;
	
	// hidden method
	default int cal(){
		return 1;
	}
	
	static int cal2(){
		return 9;
	};
	
}

abstract class B implements A{
	// hidden variable
	int hidden = 5;
	final static int num;
	static {
		num = 10;
	}
	
	static int cal2(){
		return 10;
	}
	
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
	
	final int hidden;
	static int num = 3;
	
	C(){
		hidden =1;
	}
	
	static int cal2(){
		return 11;
	}
	
	private int hide2(){
		return 5;
	}
	
	private int hide(){
		return 2;
	}
	
	// method override
	public int cal(){
		
		System.out.println(hide());
		
		Integer i = 0;
		boolean x = i instanceof Number;
		
		return 3;
	}
}

class D extends C{
	
	static int cal2(){
		return 12;
	}
	
	private int hide2(){
		return 6;
	}
	
	public int cal(){
		System.out.println(hide2());
		return 4;
	}
}

abstract class X
{
	String name = "x";
	
	
	String name2 = "xx";
	
	public void printName(){
		System.out.println(name);
	}
}

class Y extends X{
	String name ="Y";
	
	public void printName(){
		System.out.println(name);
	}
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		C c = new C();
		System.out.println(c.hidden + " " + c.num + " " + c.cal() + " " + c.cal2());
		
		B b = c;
		System.out.println(b.hidden + " " + b.num + " " + b.cal()+ " " + b.cal2());
		
		A a = c;
		System.out.println(a.hidden + " " + a.num + " " + a.cal()+ " " + A.cal2());
		
		C c2 = new D();
		System.out.println(c2.hidden + " " + c2.num + " " + c2.cal()+ " " + ((D)c2).cal2());
		
		String str1 = "J";
		String str2 = "J";
		System.out.println(str1 == str2);
		
		String str3 = new StringBuilder("J").toString();
		
		String str4 = new String("J");
		
		String str5 = new String("J");
		
		System.out.println(str4 == str5);
		
		short z = 3;
		
		short x = 1;
		short y = 1 * 3;
		
		X ax = new Y();
		
		ax.printName();
	}

}
