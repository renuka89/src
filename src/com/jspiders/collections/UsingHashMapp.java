package com.jspiders.collections;

import java.util.HashMap;
import java.util.Scanner;

public class UsingHashMapp {
	// Dictionary 
		 public static void main(String str[]) { 
		 HashMap<String,String[]> hm= new HashMap<String,String[]>(); 
		 // adding words and their meanings 
		  		 
		  		 hm.put("positivefeedback",new String[]{"good", "very good","excellent"}); 
				 hm.put("negativefeedback",new String[]{"bad", "very bad", "averge"});
		 // reading the word from the console
		 
		 Scanner scan= new Scanner(System.in); 
		 
		 System.out.println("find the meaning of words");
		 System.out.println("enter the word :");
		 
		 String word=scan.next().toLowerCase(); 
		 
		 String meaning[]=hm.get(word); 
		 
		 for(String m:meaning) 
		  System.out.println(m); 
		 }
		 } 

