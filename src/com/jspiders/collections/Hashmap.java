package com.jspiders.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Hashmap {
public static void main(String[] args) {
	
	HashMap<String, Integer> hm=new HashMap<String, Integer>();
	
	hm.put("Student1", 403);
	hm.put("Student1", 402);
	hm.put("Student2", 402);
	hm.put("Student3", 403);
	hm.put(null, 404);
	hm.put(null, 405);
	hm.put("Student4", null);

	System.out.println(hm);
	
	System.out.println("--------------------------");
	
	
	for (Map.Entry ref :hm.entrySet()) {
		System.out.println(ref);
	}
}
}
