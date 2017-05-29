package com.encapsulation;

public class BeanClass {
private int id;
private String name;


public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public static void main(String[] args) {
	
	BeanClass b1=new BeanClass();
	
	b1.setId(403);
	b1.setName("sachin");
	
	System.out.println(b1.getId());
	System.out.println(b1.getName());
}
}
