package com.jspiders.methods;

public class InstanceMembers {
int value=67;
void text()
{
	System.out.println("hey wats up..");
}
void sms(){
	
	text();
	System.out.println("hii..");
}
public static void main(String[] args) {
	InstanceMembers im=new InstanceMembers();//creating instance
	System.out.println(im.value);
	im.text();
	im.sms();
}
}
