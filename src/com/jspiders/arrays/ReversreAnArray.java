package com.jspiders.arrays;

public class ReversreAnArray {
public static void main(String[] args) {
	int[] a={12,23,34,45,67,78};
	int size=a.length;
	int mid=(a.length-1)/2;
	System.out.println(a.length);
	System.out.println("mid value :"+mid);
	for (int i = 0; i <=mid; i++) {

		System.out.println(a[i]);
	}
	System.out.println("reversing elements from array");
	for (int i =a.length-1; i>mid; i--) {
		System.out.println(a[i]);
	}
	
	
}
}
