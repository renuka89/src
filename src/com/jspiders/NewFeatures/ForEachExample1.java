package com.jspiders.NewFeatures;
/*
 For-each loop (Advanced or Enhanced For loop):
------------------------------------------------------------
The for-each loop introduced in Java5. It is mainly used to traverse array or collection elements. 
The advantage of for-each loop is that it eliminates the possibility of bugs and makes the code more readable.

Advantage of for-each loop:
--------------------------------------
It makes the code more readable.
It elimnates the possibility of programming errors.
Syntax of for-each loop:
-------------------------------------------
for(data_type variable : array | collection){}  
 */
public class ForEachExample1{  
	  public static void main(String args[]){  
		   int arr[]={12,13,14,44};  
		  
		   for(int i:arr){  
		     System.out.println(i);  
		   }  
		  
		 }   
		}  
		      
