package com.jspiders.recall;

import java.util.Scanner;

public class NestedIf {
public static void main(String[] args) {
	//int pin=2222;
	int acctBal;
	double balance;

	int amnt=5000;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("pin nnumber :");
	int pin=sc.nextInt();
	if(pin==2222){
		System.out.println("Enter the amount :");
		acctBal=sc.nextInt();
		if(acctBal<=amnt){
			amnt=amnt-acctBal;
			
			System.out.println("remaining amount :"+amnt);
			
		}else{
			System.out.println("with draw failed");
			System.out.println();;
		}
	}else{
		System.out.println("invalid pin number");
	}
}
}
