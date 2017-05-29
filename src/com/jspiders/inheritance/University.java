package com.jspiders.inheritance;

public class  University{
	 String univ="VTU";

	 void syllabus(){
		System.out.println("syllabus has been changed...");
	}
}

class Colloge extends University {
	 String loc="bangalore";
		
	 String st="bmsce";
	 void admission(){
		System.out.println("making admissions..");
	}
}

/*class SampleB1{
	public static void main(String[] args) {
		Colloge cl=new Colloge();
		System.out.println(cl.univ);
		System.out.println(cl.st);
		cl.syllabus();
		cl.admission();
	}
}*/
class Student  extends Colloge {
	String str="Sridevi";
	void test(){
		System.out.println("entrance test...");
	}
}
class Main1{
	public static void main(String[] args) {
		Student s=new Student();
		
		System.out.println(s.str);
		System.out.println(s.st);
		System.out.println(s.univ);
		
		s.syllabus();
		s.admission();
		s.test();
		
	}
}