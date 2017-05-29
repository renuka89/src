package com.jspiders.string;

public class BuilderAndBuffer {
		    public static void main(String[] args){
		    	
		        StringBuffer b=new StringBuffer("java");  
		       b.append("jspiders");  
		        System.out.println(b+"   "+b.reverse());  
		        
		 System.out.println("---------------------------------");
		 
        StringBuilder bl=new StringBuilder("java");  
        bl.append("qspiders");  
        System.out.println(bl);  
    }  
}  
