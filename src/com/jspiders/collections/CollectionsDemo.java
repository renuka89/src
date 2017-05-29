package com.jspiders.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedList;
import java.util.List;

public class CollectionsDemo {
		   public static void main(String args[]) {
		   // create array list object       
		   Collection llist = new LinkedList();
		      
		   // populate the list
		   llist.add("A");
		   llist.add("B");
		   llist.add("C");  
		      
		   // create Enumeration
		   Enumeration e = Collections.enumeration(llist);
		  // Enumeration e = arrlist.elements(); 
		      
		   System.out.println("Print the enumeration");
		      
		   while(e.hasMoreElements()){
		   System.out.println("Value is: "+e.nextElement());
		   }
		   }    
}
