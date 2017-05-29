package com.jspiders.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Linkendhashmap {
	public static void main(String[] args) {
		
		//Map<String, String> hm2=new LinkedHashMap<>();

		//HashMap<String, String> hm1=new LinkedHashMap<>();

		LinkedHashMap<String, String> hm=new LinkedHashMap<>();
		hm.put("sachin", "rit");
		hm.put("shridhar", "bmsce");
		hm.put("sujatha", "bmsce");
		hm.put("naveen", "vtu");
		hm.put("naveen", null);
		hm.put(null, null);
		hm.put(null, null);

		System.out.println(hm);
		System.out.println("-----------------------------");
		
		for (Map.Entry ref : hm.entrySet()) {
			System.out.println(ref);
		}
	}
}
