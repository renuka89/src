package com.jspiders.patterns;

public class Alphabit2 {
public static void main(String[] args) {
	for (int i = 0; i <5; i++) {
		for (int j = 0; j <=i; j++) {
			System.out.print((char)(65+j));
		}
		System.out.println();
	}
}
}
