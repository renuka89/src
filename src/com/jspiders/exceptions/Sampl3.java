package com.jspiders.exceptions;

public class Sampl3 {

public static void main(String[] args) {
	System.out.println("with in main method..");
	int[] i=new int[5];
	
	i[0]=34;
	i[1]=23;
	try{
		
	i[6]=12;
	System.out.println(i[6]);

	}catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
	}
	System.out.println("main ends");
}
}
