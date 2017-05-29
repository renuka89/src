package com.jspiders.FileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inputstream {
	
	 public static void main(String[] args) throws IOException
	 {
	  String text;
	  System.out.println("enter the data:");
	  InputStreamReader isr = new InputStreamReader(System.in);
	  BufferedReader br = new BufferedReader(isr);
	  text = br.readLine();          //Reading String  
	  System.out.println(text);
	 }
	}

