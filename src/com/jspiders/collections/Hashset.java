package com.jspiders.collections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
public static void main(String[] args) {
	
	HashSet hs=new HashSet();
	//	Set hs=new HashSet();

	 hs.add("hema");
	  hs.add(55);
	  hs.add("latha");
	  hs.add(34);
	  hs.add("jhony");
	  hs.add("jhony");
	  hs.add(null);
	  hs.add(null);
	  
	  System.out.println(hs);
	  System.out.println("---------------------");
	  Iterator itr=hs.iterator();
	  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  }  
}
}
