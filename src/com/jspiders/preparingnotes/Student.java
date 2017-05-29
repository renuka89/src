package com.jspiders.preparingnotes;

public class Student {
int Id;
String name;

void studentDetails(int rollNUM,String stdNAME){
	Id=rollNUM;
	name=stdNAME;
}
void preparingNOTES(NoteBook book,Pen pen1){
	System.out.println("preparing  notes.....");
	book.open();
	pen1.write();
	book.turnPage();
	pen1.write();
	book.turnPage();
	pen1.write();
	book.close();
}
}
