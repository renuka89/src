package com.jspiders.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
public static void main(String[] args) {
	
	List<String> que=new ArrayList<String>();
	que.add("arun");
	que.add("bhavya");
	que.add("charan");
	que.add("divya");
	que.add("ethik");
System.out.println(que);
System.out.println("2nd element :"+que.get(2));
System.out.println("3rd element :"+que.get(3));

LinkedList<String> que1=new LinkedList<String>();
que1.addFirst("rukpini");
que1.addFirst("kaveri");
que1.addFirst("aimee");
que1.addFirst("ishq");
que1.addFirst("queen");
que1.addLast("hii");

System.out.println("que 1 list  :"+que1.getFirst());
System.out.println(que1);
System.out.println(que1.removeLast());
System.out.println(que1.removeLast());
}
}
