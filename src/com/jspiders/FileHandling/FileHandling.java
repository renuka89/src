package com.jspiders.FileHandling;

import java.io.File;
import java.io.IOException;

public class FileHandling {
public static void main(String[] args) throws IOException {
	
	File f1=new File("E:\\Filehandling\\Files\\file1\\sample.xls");
	//File f=new File(f1,"sample.xls");

	
	System.out.println(f1.exists());
	Boolean b=f1.delete();
	System.out.println(b);
	
	System.out.println(f1.getAbsolutePath());
	
	
	
}
}
