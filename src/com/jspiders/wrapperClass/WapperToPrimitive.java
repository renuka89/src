package com.jspiders.wrapperClass;

public class WapperToPrimitive {  
		 public static void main(String args[]){    
		 
			 //all wraper classes are final  we cant inherit
			 
			 Double dl=3333.3333; 
			 System.out.println(dl.doubleValue());
			System.out.println(dl.intValue());
			System.out.println("-----------------");
			 
			 Double d=new Double(12.3332);//wrapper class
			 
double d1=d.doubleValue();
//unboxing convert wraper Double to primitive double
			 
			 System.out.println(d1);
			 
			 Float f=new Float(33.323);
			 
			 float f1=f.floatValue();//unboxing
			 float f2=f;//f.floatValue();auto unboxing
			 System.out.println(f1);
			 
			 Integer i=new Integer(23);
			 int i1=i;//i.intValue(); auto unboxing
			 System.out.println(i1);
			 
			 
		 }   
}
