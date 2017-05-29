package com.jspiders.methods;

public class Sample1 {
	
static String hName="sachin";//data member
int a=90;

/*static void signature(){
	System.out.println("hii....");// function member i.e method
}
*/

public static void main(String[] args) {
	
Sample1 s1=new Sample1();

System.out.println(s1.a);
s1.a=34;
System.out.println(s1.a);

Sample1 s2=new Sample1();
System.out.println(s2.a);
	System.out.println(hName);
	Sample1.hName="hindu";
	
	System.out.println(Sample1.hName);
	//signature();
}
}
