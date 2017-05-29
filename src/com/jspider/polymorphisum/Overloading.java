package com.jspider.polymorphisum;

public class Overloading {
void method(){
	System.out.println("compile...time");
}
void method(int q){
	System.out.println(q);
}
public static void main(String[] args) {
	Overloading ref=new Overloading();
	ref.method(7);

}
}