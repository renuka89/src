package com.arrays;

import java.util.Scanner;

public class Sample1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size ::");
	
	int size=sc.nextInt();
	double  []ch=new double[size];
	System.out.println("add the elements to an array");
	for (int i = 0; i < ch.length; i++) {
		ch[i]=sc.nextDouble();
	}
	System.out.println("-----------------");
	for (int i = 0; i < ch.length; i++) {
		System.out.println(ch[i]);
	}
	
}
}
