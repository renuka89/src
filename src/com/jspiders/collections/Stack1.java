package com.jspiders.collections;

import java.util.Stack;

public class Stack1 {//LIFO
	
		public static void main(String[] args) 
		{
			Stack<String> s=new Stack();
			s.push("A");
			s.push("B");
			s.push("C");
			System.out.println(s);//[A, B, C]
			System.out.println(s.pop());//C
			System.out.println(s);//[A, B]
			System.out.println(s.peek());//B
			
			System.out.println(s.empty());//false
		}
	}
