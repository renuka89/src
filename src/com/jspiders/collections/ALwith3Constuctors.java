package com.jspiders.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ALwith3Constuctors {
public static void main(String[] args) {
	
	  List<String> al=new ArrayList<String>();//creating arraylist  
	  
	  ArrayList<String> al1=new ArrayList<String>(5);//creating arraylist  

	  al1.add("Ravi");//adding object in arraylist  
	  al1.add("Vijay");  
	  al1.add("Ravi");  
	  al1.add("Ajay");
	  al.add("Ravi");//adding object in arraylist  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay"); 
	  
	  System.out.println(al1.toString());
	  
	  HashSet<String> hs=new HashSet<>();
	  hs.add("Hindu");
	  hs.add("Ravi");//adding object in arraylist  
	  hs.add("Vijay");  
	  hs.add("Ravi"); 
	  System.out.println(hs.toString());
	  
	  ArrayList<String> al2=new ArrayList<String>(hs);//creating arraylist  
	  System.out.println(al2.toString());

}
}
