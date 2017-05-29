package com.jspiders.preparingnotes;

public class Pen {
String inkColor;
double price;//global

void propertiesOFpen(String color,double cost){
	/*inkColor=color;
	price=cost;*/
	
	this.inkColor=color;
	this.price=cost;
}
void write(){
	System.out.println("writing with "+inkColor+" color pen");
}
}
