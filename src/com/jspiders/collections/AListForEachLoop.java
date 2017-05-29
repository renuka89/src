package com.jspiders.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class AListForEachLoop {
	
	 public static void main(String args[]){  
		  ArrayList al=new ArrayList();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");
		  al.add(23);
		  al.add(null);
		  al.add(null);
		  
		  
		System.out.println(al);
		System.out.println("---------------------");
		
		  System.out.println("using for each loop..");

		for (Object obj : al) {
			System.out.println(obj);
					}
		  System.out.println("----------------------------");
		  
		  System.out.println("using iterator method..");
		Iterator itr= al.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
			System.out.println("------------------------");
		 
			  System.out.println("using enumeration method..");

		Enumeration enm=Collections.enumeration(al);
		
			while(enm.hasMoreElements()){
				System.out.println(enm.nextElement());
			}
			System.out.println("------------------------------");
			  System.out.println("using for loop.");

			for (int i = 0; i <al.size(); i++) {
				System.out.println(al.get(i));
			}
		} 
}

