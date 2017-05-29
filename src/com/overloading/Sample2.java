package com.overloading;

public class Sample2 {
	
	final static void m(){
	System.out.println("zero argument");
}
	final static void m(int a){
	System.out.println("int argument");

}
	final static void m(String name){
	System.out.println("String argument  " +name);

}

public static void main(String[] args) {
	m("hi");
	System.out.println();
	
}
}
