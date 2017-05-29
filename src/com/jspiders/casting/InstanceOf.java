package com.jspiders.casting;

public class InstanceOf {
void test(Casting arg){
	System.out.println("value of w :"+arg.w);

if(arg instanceof Casting1){
	Casting1 ref1=(Casting1)arg;
	ref1.samp1();
	
}
}
}