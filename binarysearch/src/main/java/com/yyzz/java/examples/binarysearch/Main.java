package com.yyzz.java.examples.binarysearch;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {2,3,4,6};
		
		// find 5, get value at index 3
		System.out.println(Arrays.binarySearch(a, 5));
		
		// find 6, get value at index 4. but not found, therefore -(4 + 1) = -5
		System.out.println(Arrays.binarySearch(a, 5));
		
		// find 1, get value at index 0. but not found, therefore -(0 + 1) = -1
		System.out.println(Arrays.binarySearch(a, 1));
		
		
		// unsorted number;
		
		// warning, binarySearch on unsorted arrays always get "undefined"
		a = new int[]{1,4,3,2,5};
		
		System.out.println(Arrays.binarySearch(a, 2));
		
		System.out.println(Arrays.binarySearch(a, 3));
		
		System.out.println(Arrays.binarySearch(a, 4));
		
		
	}

}
