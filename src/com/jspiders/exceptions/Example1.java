package com.jspiders.exceptions;

public class Example1 {
void m(int i){
	//try{
	int a=i/0;
	/*}catch (Exception e) {
		System.out.println("printing the exception  : "+e);
	}*/
}
void n(){//calling
	//try{
	m(56);//caller
	/*}catch (Exception e) {
		System.out.println("printing the exception  : "+e);
	}*/
}
public static void main(String[] args) {
	Example1 ex=new Example1();
	try{
	ex.n();//caller
	}catch (Exception e) {
		System.out.println("printing the exception  : "+e);
		System.out.println(e.getMessage());
	}
}
}
