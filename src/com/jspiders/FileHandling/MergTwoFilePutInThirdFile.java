package com.jspiders.FileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MergTwoFilePutInThirdFile {
public static void main(String[] args) throws IOException {
	
	PrintWriter pw=new PrintWriter("C:\\Users\\HINDUPC\\Desktop\\FileHandling\\Sample4.txt");
	BufferedReader br=new BufferedReader(new FileReader
			("C:\\Users\\HINDUPC\\Desktop\\FileHandling\\Sample1.txt"));
	String lin1=br.readLine();
	while(lin1!=null){
		pw.println(lin1);
		lin1=br.readLine();
	}
	BufferedReader br1=new BufferedReader(new FileReader
			("C:\\Users\\HINDUPC\\Desktop\\FileHandling\\Sample2.txt"));
	   lin1=br.readLine();
	while(lin1!=null){
		pw.println(lin1);
		lin1=br.readLine();
	}
	pw.flush();
	br.close();
	pw.close();
}
}
