package com.jspiders.constructor;

public class UsingFinal {
	//final int a; the variable cant b declare as final with out initializing
	//if u want to make variable as final then declare in block
	//thr is no default initialization for final datanumber
	
	int ID;
	{
	 ID=403;	
	}
public static void main(String[] args) {
	UsingFinal uf=new UsingFinal();
	System.out.println("id value :"+uf.ID);
	UsingFinal uf1=new UsingFinal();
	uf1.ID=420;
System.out.println("id value :"+uf1.ID);
}
}
