package com.jspiders.collections;

import java.util.ArrayList;
import java.util.List;

public class ListInterface {
public static void main(String[] args) {
	List<String> l1=new ArrayList<String>();
	l1.add(0, "hii");
	l1.add(1, "hello");
	l1.add(2, "hey");
	System.out.println("list 1..:"+l1);
	List<String> l2=new ArrayList<String>();
	l2.add(0, "queue");
	l2.add(1, "stack");
	l2.add(2, "datastructure");
	System.out.println("list 2.."+l2);
	l2.addAll(1, l1);
	System.out.println("adding list 1 into list 2 :"+l2 );
	
}
}
