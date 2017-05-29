package com.singleton;

public class MainClass {
public static void main(String[] args) {
	
	Calculator calci=Calculator.getInstance();
	calci.divide(35, 3);
	Calculator calci1=Calculator.getInstance();
	calci1.divide(4, 7);

	
}
}
