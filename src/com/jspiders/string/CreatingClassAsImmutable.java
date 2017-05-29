package com.jspiders.string;
/*
 How to create Immutable class?
-------------------------------------------
There are many immutable classes like String, Boolean, Byte, Short, Integer,
 Long, Float, Double etc. In short, all the wrapper classes and String class 
 is immutable. We can also create immutable class by creating final class that have 
final data members as the example given below:
 */
public final class CreatingClassAsImmutable {
	
		final String name;  
		  
		public CreatingClassAsImmutable(String name){  
		this.name=name;  
		}  
		  
		public String getName(){  
		return name;  
		}  
		public String toString(){
			return name;
		}
		public static void main(String[] args) {
			CreatingClassAsImmutable ccc=new CreatingClassAsImmutable("James");
			
			String s=ccc.getName();
			
			System.out.println(s);
			
			//System.out.println(ccc);//inernally compailer invoke tostring method..
			
		}
		  
		}  
/*
 The above class is immutable because:
 --------------------------------------
The instance variable of the class is final i.e. we cannot change the value of it after
 creating an object.
The class is final so we cannot create the subclass.
There is no setter methods i.e. we have no option to change the value of the instance variable.
These points makes this class as immutable.
*/