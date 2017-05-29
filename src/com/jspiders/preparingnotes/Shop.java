package com.jspiders.preparingnotes;

public class Shop {
	
Pen buyPen(String color,int cost){
	
	Pen p1=new Pen();
	p1.propertiesOFpen("black", 10);
	if(cost>=p1.price){
		System.out.println("buying pen successfully");
		return p1;
	}else{
		System.out.println("cost of pen is more than 10");
		return null;
	}
	}

NoteBook buyBook(int cost,int pages){
	NoteBook nb=new NoteBook();
	nb.propertiesOFNoteBook(150, 40, "spiral");
	if(cost>=nb.price){
		System.out.println("buying book successfully");
		return nb;
	}else{
		System.out.println("cost of book is more than 40");
		return null;	
	}
	
}
}
