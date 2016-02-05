package com.yyzz.java.examples.innerclass;

public class Main {

	
	private int x = 5;
	
	
	
	public void test(){
		class Inner{
			public int x = Main.this.x;
			public void go(){
				System.out.println(x);
			}
		}
		
		Inner in = new Inner();
		
		in.go();
	}
	
	
	protected class Inner{
		public int x = Main.this.x;
		public void go(){
			System.out.println(x);
		}
	}
	
	
	public static void main(String[] args){
		
		Main main1 = new Main();
		Main main2 = new Main();
		String str = "a";
		System.out.println(main1.equals(str));
		
		main1.test();
		
		
		String str1 = "a" + "b";
		String str2 = "ab";
		String str3 = String.format("%s%s", "a", "b");
		
		System.out.println(str1 == str3.intern());
		
	}
	
	
	@Override
	public boolean equals(Object o){
		
		if(! (o instanceof Main)){
			return false;
		}
		return true;
	}
}
