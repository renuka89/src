package com.jspiders.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;


public class UsingArrayList {
	
public static void main(String[] args) {
	ArrayList al=new ArrayList();
	al.add(12);
	al.add(3);
	al.add(22);
	al.add("hii");
	
	
	Enumeration e=Collections.enumeration(al);
	while(e.hasMoreElements()){
		
		System.out.println(e.nextElement());
	}
	
}

}
