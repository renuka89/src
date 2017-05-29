package com.jspiders.FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffredWriter1 {
public static void main(String[] args) throws IOException  {
	
	FileWriter f=new FileWriter("E:\\Filehandling\\sample7.xls");
	
	BufferedWriter fb=new BufferedWriter(f);
	
	fb.write(100);
	fb.newLine();

	char[] ch={'h','i','i','d'};
	fb.write(ch);
	fb.newLine();
	fb.write(" am totaly fine... what about u..?");
	fb.newLine();
	fb.flush();
	fb.close();
}
}
