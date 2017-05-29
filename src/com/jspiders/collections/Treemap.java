package com.jspiders.collections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap {
	public static void main(String[] args) {
		
	// Put elements to the map
	
	TreeMap<String,Double> map = new TreeMap<String,Double>(); 
	map.put("Tomato", 20.75);
	map.put("Potato", 10.00); 
	map.put("Onion", 15.25);
	map.put("Cabbage", 17.50); 
	System.out.println(map);
	
	System.out.println(map.headMap("Onion")); 
	System.out.println(map.tailMap("Onion"));
	System.out.println(map.subMap( "Cabbage","Potato")); 
}
}
