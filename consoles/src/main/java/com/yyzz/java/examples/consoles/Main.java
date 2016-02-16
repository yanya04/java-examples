package com.yyzz.java.examples.consoles;

import java.io.Console;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console console = System.console();
		
		PrintWriter pw;
		System.out.println(console);
		if(console != null){
			
			console.format("Enter the name:");
			
			String inputName = console.readLine();
		}

	}

}
