package com.jspiders.collections;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class UsingLinkedList {
public static void main(String[] args) {
	
	List<Integer> l1=new LinkedList<Integer>();
	
	l1.add(67);
	l1.add(12);
	l1.add(1234);
	l1.add(12);
	l1.add(null);
	l1.add(null);

	Enumeration e=Collections.enumeration(l1);
	
	while(e.hasMoreElements()){
		System.out.println(e.nextElement());
	}
	System.out.println("---------------------------------");
	
Iterator itr=l1.iterator();
	
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	
}
}
