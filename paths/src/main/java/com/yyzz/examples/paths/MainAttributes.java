package com.yyzz.examples.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

public class MainAttributes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			BasicFileAttributes data = Files.readAttributes(Paths.get("."), BasicFileAttributes.class);
			
			BasicFileAttributeView view = Files.getFileAttributeView(Paths.get("."), BasicFileAttributeView.class);
			
			
			
			
		} catch (IOException e) {
		}

	}

}
