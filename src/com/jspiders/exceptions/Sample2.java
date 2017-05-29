package com.jspiders.exceptions;

import java.lang.Exception;

public class Sample2 
{
	public static void main(String[] args)
	{
		try
		{
				try
				{
					int[] a=new int[5];
					a[6]=2;
					System.out.println(a[6]);
				}
				catch(ArithmeticException e)
				{
				System.out.println(e);
				System.out.println("1st catch block");
				}
				
		}catch(Exception e){
			System.out.println(e);
			System.out.println("2nd catch bloick");
			}
		finally{
		System.out.println("finally block...");
	}
	}
		
}