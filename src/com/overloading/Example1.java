package com.overloading;

public class Example1 {
	
final static void test(){
	
	System.out.println("entrance test..");
}
final static int test(int rolno){
	
	System.out.println("exam 1 "+rolno);
	return 0;
}
final static void test(String stdname){
	
System.out.println("exam 2" +stdname);	
}

final static void test(int rolno,String stdname){
	
	System.out.println(rolno+"   "+stdname);
}
public static void main(String[] args) {
	Example1.test(56,"jhon");
}
}
