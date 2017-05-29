package com.jspiders.FileHandling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter1 {
public static void  main(String[] args) throws IOException {
	File f=new File("E:\\Filehandling\\sample6.xls");
	
	PrintWriter pw=new PrintWriter(f);
	
	pw.write(97);
	pw.println(97);
	pw.println("o my god.....");
	pw.print(true);
	pw.println('h');
	pw.println(" .hii buddies..........");
	pw.flush();
	pw.close();
	
}



}
