package com.singleton;

public class Calculator {
	
private static int count=0;//data types

private static Calculator ref=null;

private Calculator(){
	System.out.println("creating calculator instance");
	count++;
	System.out.println(count);
	}

void divide(int num1,int num2){
	int res=num1/num2;
	System.out.println("result :"+res);
}
static Calculator getInstance(){
	if(count==0){
		ref=new Calculator();
	}
	return ref;
}
public static void main(String[] args) {
	
	Calculator calci=Calculator.getInstance();
	
	calci.divide(35, 3);
	
	Calculator calci1=Calculator.getInstance();
	calci1.divide(54, 7);
	

	
}
}


