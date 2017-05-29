package com.jspiders.FileHandling;

import java.io.File;
import java.io.IOException;

public class CreateFileinDirectory {
public static void main(String[] args) throws IOException {
	File f1=new File("C:/Users/HP/Desktop/FileHandling/Sample.txt");
	boolean f=f1.createNewFile();
	System.out.println(f);
	System.out.println(f1.getAbsolutePath());
	f1.delete();
}
}
