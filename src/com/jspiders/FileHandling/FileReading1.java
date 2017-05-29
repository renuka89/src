package com.jspiders.FileHandling;


import java.io.FileReader;
import java.io.IOException;

public class FileReading1 {
public static void main(String[] args) throws IOException {
	FileReader fr=new FileReader("E:\\Filehandling\\sample6.xls");
	
	int i=fr.read();
	while(i!=-1){
		char ch=(char)i;
	System.out.print(ch);
i=fr.read();
	}
	System.out.println();
	fr.close();
	
}
}
