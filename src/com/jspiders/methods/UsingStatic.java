package com.jspiders.methods;

public class UsingStatic {
int id;//global
String name;
static String instituteName="Jspiders";

UsingStatic(int i,String Name){//local variables
	id=i;
	name=Name;
}
void students(){//u can call static members in instance method but can't call instance members in static
	System.out.println(id+"  "+name+"  "+instituteName);
}
public static void main(String[] args) {
	
	UsingStatic ref=new UsingStatic(1, "Hindu");
	UsingStatic ref1=new UsingStatic(2, "rakesh");

	UsingStatic ref2=new UsingStatic(3, "shridhar");
	ref.students();
	ref1.students();
	ref2.students();

}
}
