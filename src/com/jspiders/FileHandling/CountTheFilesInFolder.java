package com.jspiders.FileHandling;

import java.io.File;

public class CountTheFilesInFolder {
public static void main(String[] args) {
	int count=0;
	 File f1=new File("E:\\j2eeNOTES");
	 
	 String[] list1=f1.list();
	 
	 for (String string : list1) {
		count++;
		System.out.println(string);
	}
	 System.out.println(count);
}
}
