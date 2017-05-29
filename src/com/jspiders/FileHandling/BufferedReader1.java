package com.jspiders.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReader1 {
public static void main(String[] args) throws IOException {
	
	FileReader fr=new FileReader("E:\\Filehandling\\sample6.xls");
	
	BufferedReader br=new BufferedReader(fr);
	
	String str=br.readLine();
	
	while(str!=null){
		System.out.println(str);
		str=br.readLine();

	}
	br.close();
}
}
