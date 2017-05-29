package com.jspiders.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator1 {
	public static void main(String args[]){  

	LinkedList<String> l1=new LinkedList();
	
	l1.add("hii");
	l1.add("helo");
	l1.add("bye");
	l1.add("oy");
	l1.add("hey");
	
	//System.out.println("ddd");
	
	ListIterator itr=l1.listIterator(l1.size());
	  System.out.println("traversing elements in backward direction...");  

	while(itr.hasPrevious()){  
		System.out.println(itr.previous());
		 }  
		  	  
		 
		}  
	
}


