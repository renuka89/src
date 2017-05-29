package com.jspiders.patterns;

public class AddNumber {
public static void main(String[] args) {
	int a=1234;
	int tem=0;
	int result=0;
	
	while(a>0){
		tem=a%10;
		result=result+tem;
		a=a/10;
	}
	System.out.println(result);
}
}
