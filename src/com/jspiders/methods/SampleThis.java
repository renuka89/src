package com.jspiders.methods;

public class SampleThis {
	int id;  
    String name;  
      
    SampleThis(int id,String name){  
   this. id = id;  
  this.  name = name;  
    /*this.id = id;  
    this.name = name; */
    }  
    void display(){
    	System.out.println(id+" "+name);
    	}  
  
    public static void main(String args[]){  
    	SampleThis s1 = new SampleThis(111,"Karan");  
    	SampleThis s2 = new SampleThis(321,"Aryan");  
    s1.display();  
    s2.display();  
    }  
}
