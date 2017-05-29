package com.jspiders.FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReading2 {
public static void main(String[] args) throws IOException {
	File f=new File("E:\\Filehandling\\sample6.xls");
	
	FileReader fr=new FileReader(f);
	
	char[] ch=new char[(int)f.length()];
fr.read(ch)	;


for (char c1 : ch) {
	System.out.print(c1);
}
}
}
