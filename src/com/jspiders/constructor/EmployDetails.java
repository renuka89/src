package com.jspiders.constructor;

public class EmployDetails {
	int iD;      //global variables
	String empNm;
	String designation;
	int q;
	
	EmployDetails(int ID,String empName,String domine){//local variables
		this.designation=domine;
		this.empNm=empName;
		this.iD=ID;
		
		}
	
	void login(){
		System.out.println(empNm+"is log in at 23:22");
	}
	public static void main(String[] args) {
		
	EmployDetails ref=new EmployDetails(403, "jhon"," developer");
	ref.login();
	EmployDetails ref1=new EmployDetails(420, "james"," testing");

	ref1.login();
	
	
	/*System.out.println("employ name:"+ref.empNm);
	System.out.println("employ domine:"+ref.designation);
	System.out.println("employ ID:"+ref.iD);
	
	System.out.println("----------------------");
	System.out.println();
	EmployDetails ref1=new EmployDetails(420, "james"," testing");
	
	System.out.println("employ name:"+ref1.empNm);
	System.out.println("employ domine:"+ref1.designation);
	System.out.println("employ ID:"+ref1.iD);*/
	}
}
