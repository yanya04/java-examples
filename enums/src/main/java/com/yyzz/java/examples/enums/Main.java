package com.yyzz.java.examples.enums;

public class Main {
	enum Season{
		SUMMER("A"), WINTER("B"){
			@Override
			public void printCode(){
				System.out.println("override");
			}
		}, SPRING("C");
		private String code;
		private Season(String code){
			this.code = code;
		}
		
		public void test(){
			code = "a";
		}
		
		public void printCode(){
			System.out.println(code);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Season season = Season.SPRING;
		switch(season){
		case SUMMER: System.out.print("haha");break;
		case WINTER: System.out.println("lala");break;
		case SPRING: System.out.println("xxx"); break;
		default: System.out.println("lulu");		
		}
		Season.WINTER.printCode();
		
		Season winter = Season.WINTER;
		winter.printCode();
		System.out.println(Season.SUMMER.ordinal());
		
	}
}
