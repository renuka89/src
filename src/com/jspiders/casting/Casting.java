package com.jspiders.casting;

public class Casting {
	int w=78;
void samp()
{
	System.out.println("hi");
}
}
//---------------------

class Casting1 extends Casting{
	int i=90;
void samp1()
{
	System.out.println("bye");
}

public static void main(String[] args) {
	
	Casting c=new Casting1();//implicit upcasting
	
	c.samp();
	
	Casting1  c1=(Casting1)c;
	
	c1.samp();
	c1.samp1();
	
	
	//Casting1 c1=(Casting1) new Casting();
	//its not proper way to perform down casting  we will get 
	//class not found exception
	
}
}

 
 