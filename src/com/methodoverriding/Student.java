package com.methodoverriding;

public class Student {
  int test(){
	System.out.println("givng test");
	return 12;
	}
}
class Supplyment extends Student{
	
    public int test(){
		System.out.println("suply test");
		return 21;
		 }
	
	public static void main(String[] args) {
		Supplyment s1=new Supplyment();
		s1.test();
	}
}