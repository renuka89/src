package com.jspiders.recall;

public class NonStaticMethods {
void teach(){
	System.out.println("teacher teching lesson");
}
 int student(){
	System.out.println("number of students in clss");
	return 50;
}
public static void main(String[] args) {
	NonStaticMethods ns=new NonStaticMethods();
	ns.teach();
	double  x=ns.student();
	System.out.println(x);
}
}
