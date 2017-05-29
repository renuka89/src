package com.jspiders.preparingnotes;

public class MainClass {
public static void main(String[] args) {
	
	Shop store=new Shop();
	
	Pen p1=store.buyPen("blue", 15);
	NoteBook nb=store.buyBook(50, 150);
	
	Student st=new Student();
	//NoteBook nb=new NoteBook();
	nb.propertiesOFNoteBook(150, 25, "classmate");
	//Pen p1=new Pen();
	p1.propertiesOFpen("blue", 15);
	st.preparingNOTES(nb, p1);
}
}
