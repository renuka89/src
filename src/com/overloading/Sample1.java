package com.overloading;

public class Sample1 {
 static void text(){
	System.out.println("running text with zero argument..");
}
static void text(int a){
	System.out.println("single Argument :"+a);
}
static void text(double b){
	System.out.println("single Argument with different data type :"+b);
}
static void text(String name,String frnName){
	System.out.println("passing stwo arguments"+name +" and "+frnName);
	
}
public static void main(String[] args) {
	Sample1 s1=new Sample1();
	Sample1.text(3);
	Sample1.text(5.5);
	Sample1.text();
	Sample1.text("sachin", "jhons");
	
}

}
