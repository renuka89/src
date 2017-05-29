package com.jspiders.collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		
	Queue<Integer> fifo =new LinkedList<Integer>();
	
			fifo.add(3);
			fifo.add(1); 
			fifo.add(2);
			fifo.add(1);
			fifo.add(null);
			System.out.println(fifo);
			
			//System.out.println(fifo.peek());// 3
			System.out.println("removing the elements based on the way u inserted..");
			System.out.println("the element which is removed:"+fifo.poll());
			System.out.println("the element which is removed:"+fifo.poll());
			System.out.println("the element which is removed:"+fifo.poll());
			System.out.println("the element which is removed:"+fifo.poll());
			System.out.println("the element which is removed:"+fifo.poll());

			System.out.println(fifo);
			System.out.println("-----------------");
			
			Queue<Integer> pq =new PriorityQueue<Integer>();

			pq.add(5);
			 pq.add(3);
			 pq.add(8);
			 pq.add(2);
			 System.out.println(pq);
			 
			System.out.println(pq.peek());//2
			
			System.out.println(pq.toString());
			System.out.println("removing elements based on priority..");
			System.out.println("the element which is removed:"+pq.poll());//2
			System.out.println(pq);
			System.out.println("the element which is removed:"+pq.poll());//3
			System.out.println("the element which is removed:"+pq.poll());//5
			System.out.println("the element which is removed:"+pq.poll());//8
			System.out.println(pq);

}
}