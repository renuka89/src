package com.jspiders.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FilenotfoundEXP {
	  public static void main(String[] args)
	    {
	       String filePath = "D:\\Open.txt";
	        
	       BufferedReader reader = null;
	        
	       try
	       {
	           reader = new BufferedReader(new FileReader(filePath));            
	       } 
	       catch (FileNotFoundException e) 
	       {
	           e.printStackTrace();
	       }
	       finally
	       {
	           try
	           {
	               if(reader != null)
	               {
	                   reader.close();
	               }
	           } 
	           catch (IOException e) 
	           {
	               e.printStackTrace();
	           }
	       }
	    }
	}
