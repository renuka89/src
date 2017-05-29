package com.jspiders.FileHandling;


import java.io.FileWriter;
import java.io.IOException;

public class WritwDataInFile {
public static void main(String[] args) throws IOException {
	
	FileWriter fw=new FileWriter("E:\\Filehandling\\sample6.xls");
	
	fw.write(97);
	fw.write('\n');

	fw.write("hii.... dear! how r u");
	fw.write('\n');
	char[] ch={'a','s','d','f','g'};
	fw.write(ch);
	fw.write('\n');
	fw.write("97");

	fw.flush();
	fw.close();
	System.out.println("data entered in text file");
}
}
