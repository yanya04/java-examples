package com.yyzz.examples.localdate;

import java.time.ZoneId;

public class MainZone {

	public static void main(String[] args) {
		
		ZoneId.getAvailableZoneIds().stream()
		.filter( z -> z.contains("Aisa") || z.contains("Tokyo"))
		.sorted().forEach(System.out::println);

	}

}
