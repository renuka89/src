package com.jspiders.collections;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
public static void main(String[] args) {
	
	Set ts=new  TreeSet();
	
	ts.add(34);
	ts.add(12);
	ts.add(2);
	ts.add(16);
	ts.add(12);
//ts.add(null);// we can't insert  null value
	
	System.out.println(ts);
	
}
}
