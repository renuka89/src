package com.jspiders.blocks;

public class Student {
	int rollNo; //global variable
	String stdName;
	int marks;
	int s;
private	Student(int rollNo,String name,int Marks){
		
		this.rollNo=rollNo;//local variables
		this.stdName=name;
		this.marks=Marks;
		//System.out.println(rollNo);
		//System.out.println(name);
	}
	void test(int q){
		//this.s=q;
		System.out.println(s);
		System.out.println(rollNo);
		System.out.println(stdName);
	}
	void stdMarks(){
		System.out.println(marks);
	}
	public static void main(String[] args) {
	
		Student e1=new Student(403, "jhony",78);
		Student e2=new Student(404, "jhon",45);
		Student e3=new Student(405, "ghj",47);
		
		System.out.println("----------");
		e3.test(4);
		e3.stdMarks();
		
	}

}
