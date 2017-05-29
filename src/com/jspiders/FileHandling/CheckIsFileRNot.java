package com.jspiders.FileHandling;

import java.io.File;

public class CheckIsFileRNot {
public static void main(String[] args) {
	int count=0;
	File f1=new File("E:\\j2eeNOTES\\jsp books");
	String[] list1=f1.list();
	
	for (String string : list1) {
		
		File f2=new File(f1,string);
		if (f2.isFile()) {
			count++;
			System.out.println(string);
		
		System.out.println(count);
	}
}}
}
