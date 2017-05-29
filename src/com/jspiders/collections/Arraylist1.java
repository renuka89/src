package com.jspiders.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.jspiders.composition.Battery;

public class Arraylist1 {
	public static void main(String args[]){
		
		  List<String> al=new ArrayList<String>();//creating arraylist  
		  al.add("Ravi");//adding object in arraylist  
		  al.add("Vijay");  
		  al.add("Raju");  
		  al.add("Ajay");  
		  
		  System.out.println("printing al LIST elements :"+al);
		  
		 al.add(2, "sachin");
		 
		 System.out.println("after adding data in 2nd index  :"+al);
		 System.out.println("----------------------------------");
		 
		 Collection<String> a2=new ArrayList<String>();//creating arraylist  
		  a2.add("qwe"); 
		  a2.add("asd");  
		  a2.add("sdd");  
		  a2.add("ar");
		  		  System.out.println("adding one collection to another collection of data  ::");
		  al.addAll(a2);
		  System.out.println(al);
System.out.println("--------------------------------------");
		  a2.addAll(al);
		  System.out.println(a2);
		  System.out.println("-------------------------------");
		  
		  System.out.println("adding one collection data  to another collection from perticular index   ::"); 
		 al.addAll(3, a2);
		  System.out.print(al);
		 	 }  
		}  