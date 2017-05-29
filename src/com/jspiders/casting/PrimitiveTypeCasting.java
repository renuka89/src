package com.jspiders.casting;

public class PrimitiveTypeCasting {
	short test(){
int a=8;
return (short)a;
}
	public static void main(String[] args) {
		PrimitiveTypeCasting ref=new PrimitiveTypeCasting();
		
		char x=(char) ref.test();
		System.out.println(x);
	}
	
	
	/*public static void main(String[] args) {
		
char c='a';
int ch=c;
System.out.println(ch);

int a=45;
double d=a;
System.out.println(d);
System.out.println("--------------------");

double dl=45.677;
int i=(int) dl;
float f=(float) dl;
System.out.println(f);
System.out.println(i);
	}*/
}