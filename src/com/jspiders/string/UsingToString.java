package com.jspiders.string;

public class UsingToString {
	//class Student{  
		 int rollno;  
		 String name;  
		 String city;  
		  
		 UsingToString(int rollno, String name, String city){  
		 this.rollno=rollno;  
		 this.name=name;  
		 this.city=city;  
		 }
		 
public String toString(){
	return rollno +"  "+name +"  "+city;
}
		 
public static void main(String args[]){ 
	
	UsingToString s1=new UsingToString(101,"Raj","lucknow");  
	UsingToString s2=new UsingToString(102,"Vijay","ghaziabad");  
	UsingToString s3=new UsingToString(103,"john","thailand");  
   
	System.out.println(s1.toString());
 System.out.println(s2);//compiler writes here s2.toString()  
 System.out.println(s3);//compiler writes here s3.toString()  
 
 
}  
}





/*public static void main(String args[]){  
ToString s1=new ToString(101,"Raj","lucknow");  
ToString s2=new ToString(102,"Vijay","ghaziabad");  

System.out.println(s1);//compiler writes here s1.toString()  
System.out.println(s2);//compiler writes here s2.toString()  
}  
}*/  