package com.jspiders.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Linkdhashset1 {
public static void main(String[] args) {
	
	LinkedHashSet lh1=new LinkedHashSet();
	lh1.add("hii");
	lh1.add("hello");
	lh1.add("hii");
	lh1.add("bye");
	lh1.add("hey");
	lh1.add(null);
	lh1.add(null);

	System.out.println(lh1);

}
}
