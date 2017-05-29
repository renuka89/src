package com.jspiders.arrays;
/*
 Syntax to Declare Multidimensional Array in java
-----------------------------------------
dataType[][] arrayRefVar; (or)  
dataType [][]arrayRefVar; (or)  
dataType arrayRefVar[][]; (or)  
dataType []arrayRefVar[];   
 */
public class MultiDimentional {
	public static void main(String args[]){  
		  
		//declaring and initializing 2D array  
		int arr[][]={{1,2,3},{2,4,5},{4,4,5},{5,7,8}};  
		  
		//printing 2D array  
		for(int i=0;i<=3;i++){  
		 for(int j=0;j<=3;j++){  
		   System.out.print(arr[i][j]+" ");  
		 }  
		 System.out.println();  
		}  
			  
		}
}
/*
 1.Example to instantiate Multidimensional Array in java
____________________________________________________________
int[][] arr=new int[3][3];//3 row and 3 column  
2.Example to initialize Multidimensional Array in java

arr[0][0]=1;  
arr[0][1]=2;  
arr[0][2]=3;  
arr[1][0]=4;  
arr[1][1]=5;  
arr[1][2]=6;  
arr[2][0]=7;  
arr[2][1]=8;  
arr[2][2]=9;  
 */
