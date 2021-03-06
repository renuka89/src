package com;

import java.util.HashMap;
import java.util.Map;

public class CloneHashMaptoOther {
	public static void main(String args[]) {

		// Create a HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();

		// Adding few elements
		hmap.put(11, "Jack");
		hmap.put(22, "Rock");
		hmap.put(33, "Rick");
		hmap.put(44, "Smith");
		hmap.put(55, "Will");

		System.out.println("HashMap contains: " + hmap);
		// Creating a new HashMap
		// HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
		Map<Integer, String> hmap2 = (HashMap<Integer, String>) hmap.clone();
		// cloning first HashMap in the second one
		// hmap2=(HashMap)hmap.clone();

		System.out.println("Cloned Map contains: " + hmap2);
	}
}
