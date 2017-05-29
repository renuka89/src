package com.jspiders.methods;

public class Student {
	String stname;
	String loc;
	void test(String name,String loc,String quli){
		this.stname=name;
		this.loc=loc;
		System.out.println(name);
		System.out.println(loc);
		System.out.println(quli);

	}
	void form(){
		System.out.println(stname);
		System.out.println(loc);
	}
	public static void main(String[] args) {
		Student st=new Student();
		st.test("renuka","bengaluru","b.e");
		System.out.println("---------");
		st.form();
	}
}
