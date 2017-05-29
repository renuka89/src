package com.jspiders.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class CovertHashsetToTreeset {
public static void main(String[] args) {
	
		Set<String> hs=new HashSet<String>();
		hs.add("1gowri");
		hs.add("2hari");
		hs.add("6lathika");
		hs.add("3kaveri");
		hs.add("himaja");
		//hs.add(null);
		System.out.println(hs.toString());
		System.out.println("---------------------------------------");
		Set<String> sset=new TreeSet<String>(hs);
		
		System.out.println("elements after sorting");
	System.out.println(sset);
	
	
	
	System.out.println(sset);

}
}
