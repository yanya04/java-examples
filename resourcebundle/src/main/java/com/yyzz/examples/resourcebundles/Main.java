package com.yyzz.examples.resourcebundles;

import java.util.Locale;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.Set;

public class Main {
	
	public static void main(String[] args){
		
		Locale france = new Locale("fr", "FR");
		Locale us = new Locale("en", "US");
		
		ResourceBundle rb = ResourceBundle.getBundle("Zoo", france);
		
		Set<String> keys = rb.keySet();
		keys.stream().map(k -> k + " -> s" + rb.getString(k)).forEach(System.out::println);
		
		Properties props = new Properties();
		rb.keySet().stream().forEach(k -> props.put(k, rb.getString(k)));
		System.out.println(props);
		
		
	}
	
}
