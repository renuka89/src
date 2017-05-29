package com.jspiders.exceptions;

public class InterruptedExp {
		    public static void main(String[] args) 
	    {
	        Thread t = new Thread()
	        {
	            public void run() 
	            {
	                
	                	System.out.println("hey..");
	                  
							try {
								Thread.sleep(10000);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						
	                
	            }
	        };
	         
	        t.start();
	         
	        try
	        {
	            Thread.sleep(3000);   //main thread sleeping for 3s
	        } 
	        catch (InterruptedException e) 
	        {
	            e.printStackTrace();
	        }
	         
	       // t.interrupt();    //interrupting thread t
	    }
	}
