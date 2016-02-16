package com.yyzz.examples.paths;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MainPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path path = Paths.get("zoo/../home").getParent().toAbsolutePath();

		System.out.println(path);
		System.out.println(path.subpath(0, 4));
		System.out.println(path.getNameCount());
		System.out.println(path.getName(2));
		System.out.println(path.getRoot());
		System.out.println(Paths.get("/").getParent());
		
		
		Path path1 = Paths.get("a/b/c");
		Path path2 = Paths.get("b/d/e");
		
		System.out.println(path1.relativize(path2));
		
		try {
			System.out.println(Files.isSameFile(path1, path2));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println(path1.relativize(path2));
		try {
			path1.toRealPath();
		} catch (IOException e) {
		}
		try {
			Files.deleteIfExists(path2);
		} catch (IOException e) {
		}
	}

}
