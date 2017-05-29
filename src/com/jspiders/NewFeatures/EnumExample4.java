package com.jspiders.NewFeatures;
//Example of specifying initial value to the enum constants.
//Constructor of enum type is private. If you don't declare private compiler 
//internally creates private constructor.
public class  EnumExample4{  
	enum Season{   
		WINTER(5), SPRING(10), SUMMER(15), FALL(20);   
		  
		private int value;  
		private Season(int value){ 
			
		this.value=value;  
		}  
		}  
		public static void main(String args[]){  
		for (Season s : Season.values())  
		System.out.println(s+" "+s.value);  
		  
		}}  
		   
/*
 Can we create the instance of enum by new keyword?
--------------------------
No, because it contains private constructors only.
----
Can we have abstract method in enum?
---------------
Yes, ofcourse! we can have abstract methods and can provide the implementation of these methods.
---
Java enum in switch statement
----------------
We can apply enum on switch statement as in the given example:
 */
