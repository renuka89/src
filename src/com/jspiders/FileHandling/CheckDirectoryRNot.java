package com.jspiders.FileHandling;

import java.io.File;

public class CheckDirectoryRNot {
	public static void main(String[] args) {
		int count=0;
		File f1=new File("D:\\Jdbc&J2ee");
		
		String[] list1=f1.list();
		
		for (String string : list1) {
			
			File f2=new File(f1,string);
			
			if (f2.isDirectory()) {
				count++;
				System.out.println(string);
			
			System.out.println(count);
			}
			}
}}
