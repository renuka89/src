package com.jspiders.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Listiterator {
public static void main(String[] args) {
	
	List<String> l1=new ArrayList<String>();
	//	LinkedList<String> l1=new LinkedList();

	l1.add("rohit");
	l1.add("vivek");
	l1.add("uppi");
	l1.add("shridhar");
	l1.add("uday");
	l1.add("lavanya");
	
	
		ListIterator lt=l1.listIterator(l1.size());
	
	System.out.println("printing  elements.....in reverse ......");
	
	while(lt.hasPrevious()){
		
	System.out.println(lt.previousIndex()+"."+lt.previous());
	}
	
		System.out.println("printing  elements...... in forward ...........");
	while(lt.hasNext()){
		Object element=lt.next();
		
		System.out.println(element);
	}
	
	
}
}
