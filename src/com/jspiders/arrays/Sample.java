package com.jspiders.arrays;

import java.util.Scanner;

public class Sample {
	public static void main(String args[]){  
		  
		String a[]=new String[5];//declaration and instantiation  
		/*a[0]="hindu";//initialization  
		a[1]="sindhu";  
		a[2]="bindhu";  
		a[3]="shri";  
		a[4]="aimee"; */ 
		  Scanner sc=new Scanner(System.in);
		  System.out.println("initialize the values");
		for(int i=0;i<a.length;i++)//length is the property of array  
			System.out.println(a[i]=sc.next());  
			  
			
		//printing array  
		for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]);  
		  
		}
}
