package com.yyzz.examples.paths;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(Paths.get(".").toRealPath());
		} catch (IOException e) {
		}

		System.out.println(Files.exists(Paths.get(".")));
		
		try {
			System.out.println(Files.isSameFile(Paths.get("."), Paths.get("../paths")));
		} catch (IOException e) {
		}
		
		try {
			Files.createFile(Paths.get("test"));
		} catch (IOException e) {
		}
		
		try {
			Files.delete(Paths.get("test"));
		} catch (IOException e) {
		}
		
		try (BufferedReader reader = Files.newBufferedReader(Paths.get("test"))){
			String line = null;
			while((line = reader.readLine())!=null){
				System.out.println(line);
			}
		} catch (IOException e1) {
		} 
		
		try {
			Files.deleteIfExists(Paths.get("test"));
		} catch (IOException e) {
		}
		
		System.out.println(Files.isDirectory(Paths.get("./test")));
		
		Path test2 = Paths.get("test2");
		try {
			Files.createFile(test2);
		} catch (IOException e) {
		}
		try {
			Files.isHidden(test2);
		} catch (IOException e) {
		}
		Files.isReadable(test2);
		Files.isWritable(test2);
		
		try {
			System.out.println(Files.getLastModifiedTime(test2).toMillis());
			Files.setLastModifiedTime(test2, FileTime.from(Instant.now()));
			System.out.println(Files.getLastModifiedTime(test2).toMillis());
		} catch (IOException e) {
		}
		
		try {
			System.out.println(Files.getOwner(test2));
		} catch (IOException e) {
		}
		
		try {
			System.out.println(FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByGroupName("wheel"));
		} catch (IOException e) {
		}
		BasicFileAttributes attrs = null;
		try {
			attrs = Files.readAttributes(test2, BasicFileAttributes.class);
		} catch (IOException e) {
		}
		System.out.println(attrs.isDirectory());
		
		try {
			Files.walk(Paths.get(".."))
				.filter(p -> p.toString()
				.endsWith(".java"))
				.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
