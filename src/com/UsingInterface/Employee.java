package com.UsingInterface;

public interface Employee {
int sal=23000; //by default public static final
void login();  //by default abstract
void logout();
}

 abstract class Padma implements Employee{

	@Override
	public void login() {
System.out.println("log in time" );		
	}
	/*@Override
	public void logout() {
System.out.println("log out time");		
	}*/
}
class Padma1 extends Padma{
	
	@Override
	public void logout() {
System.out.println("log out time");		
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Padma1();
		
		emp.login();
		emp.logout();
		System.out.println("salary of employee : "+Employee.sal);
		
		//Employee.sal=23333; //can't b changed
		
		
	}
}