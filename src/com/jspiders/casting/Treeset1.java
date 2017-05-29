package com.jspiders.casting;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset1 {
public static void main(String[] args) {
	SortedSet<Object> ref=new TreeSet<>();
	ref.add(4);
	ref.add(4);
	ref.add(5);
	ref.add(7);
	ref.add(0);
	//ref.add(null); treeset wont allow null values

System.out.println(ref);
TreeSet<Object> ref1=new TreeSet<>();

ref1.add("sindhu");
ref1.add("naveen");
ref1.add("k");
ref1.add("jhon");
ref1.add("cherry");

System.out.println(ref1);
}
}
