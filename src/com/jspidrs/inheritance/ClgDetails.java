package com.jspidrs.inheritance;

public interface ClgDetails {
String name="BMS";
String loc="Bangalore";

void admission();
}

class Student implements ClgDetails{

	@Override
	public void admission() {
System.out.println("making admission..");		
	}
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(Student.name);
		System.out.println(Student.loc);
s.admission();
		
	}
}