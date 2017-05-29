package com.jspiders.recall;

public class SwitchStatement {
public static void main(String[] args) {
	char grade='a';
	switch(grade)
	{
	case 'a':
		System.out.println("student passd with distinction");
		break;
	case 'b':
		System.out.println("first clss");
		break;
	case 'c':
		System.out.println("second clss");
		break;
	case 'd':
		System.out.println("thrid clss");
		break;
		default : System.out.println("absent");
	}
}
}
