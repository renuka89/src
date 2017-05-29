package com.jspiders.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Treemap1 {
public static void main(String[] args) {
		
		TreeMap<String, Integer> hm=new TreeMap<>();
		
		hm.put("student7", 29);
		hm.put("student5", 29);
		hm.put("student6", 9);
		hm.put("student2", 45);
		hm.put("student2", null);
		hm.put("student4", null);
		hm.put("student8", 39);
	//	hm.put(null, null); //key can't be null

		System.out.println(hm);
		System.out.println("--------------------------------------");
		
		for (Map.Entry ref : hm.entrySet()) {
			//System.out.println(ref);
			System.out.println(ref.getKey()+"   "+ref.getValue());

		}
	}

}
