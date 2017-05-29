package com.jspiders.arrays;
/*
 Single Dimensional Array in java
--------------------------------------
Syntax to Declare an Array in java
__________________________
dataType[] arr; (or)  
dataType []arr; (or)  
dataType arr[];  
 */
public class PassingArrayToMethod {
	 
		static void min(int arr[]){  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println(min);  
		}  
		  
		public static void main(String args[]){  
		  
		int a[]={33,3,4,5};  
		min(a);//passing array to method  
		  
		}}  

