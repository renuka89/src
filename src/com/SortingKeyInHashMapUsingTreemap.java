package com;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortingKeyInHashMapUsingTreemap {
	public static void main(String[] args) {
	
HashMap<Integer,String> ref=new HashMap<Integer,String>();
		ref.put(2, "sita");
		ref.put(4, "mandavi");
		ref.put(16, "urmila");
		ref.put(1, "ram");
		ref.put(93, "bharata");
		ref.put(5, "lakshmana");
		System.out.println("before sorting ");
		for (Map.Entry me : ref.entrySet()) {
			System.out.println("key :"+me.getKey() +"value :"+me.getValue());
		}
		System.out.println("after sorting ");
		Map<Integer,String> ref1=new TreeMap<Integer, String>(ref);
		for (Map.Entry me : ref1.entrySet()) {
			System.out.println("key :"+me.getKey() +"value :"+me.getValue());
		}
}
}