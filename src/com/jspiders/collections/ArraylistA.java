package com.jspiders.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArraylistA {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(12);
	a.add(1);
	a.add('e');
	a.add("java");
	
	System.out.println(a.toString());
	
	Iterator it=a.iterator();
	while(it.hasNext()){
		System.out.println(it.next());
	}
}
}
