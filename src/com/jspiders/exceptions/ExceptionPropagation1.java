package com.jspiders.exceptions;

public class ExceptionPropagation1{
	
		  void m(int a){  
			    System.out.println("exception encountered");
			    try{
		    int data=a/0; 
		    System.out.println(a);
			    }catch(ArithmeticException e){
					  System.out.println(e);
				  }
		  } 
		  
		  void n(){ 
		    m(12); 
		  } 
		  
		  void p(){
		    n(); 
		  } 
		  
		  public static void main(String args[]){
			  
		   ExceptionPropagation1 obj=new ExceptionPropagation1();
		   //try{
		   obj.p(); 
		   /*}catch(ArithmeticException e){
			   System.out.println(e);
		   }*/
		   System.out.println("normal flow...");  
		  }  
		}  

