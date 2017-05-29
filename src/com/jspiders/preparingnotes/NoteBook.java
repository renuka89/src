package com.jspiders.preparingnotes;

public class NoteBook {
	
int nPages;//global
int price;
String brand;

void propertiesOFNoteBook(int pages,int cost,String comp){
	nPages=pages;
	price=cost;
	brand=comp;
}
void open(){
	System.out.println("open the book....");
}
void close(){
	System.out.println("close the book...");
}

 void turnPage() {
	 System.out.println("turn the next page...");
 
	
}
}
