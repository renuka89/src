package com.jspiders.patterns;

public class PrimeNumber {
public static void main(String[] args) {
	int a=1;
	System.out.println(a);
	for (int i =2; i <10; i++) {
		if (i%2==0) {
			System.out.println(i+" :is not prime");
			
		}else{
			System.out.println("prime number is  :"+i);
		}
	}
}
}
