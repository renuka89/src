package com.jspiders.exceptions;

public class AgeInvalidException extends Exception{
	String msg;

	 AgeInvalidException(String msg){
		this.msg=msg;
	}
	 
	public String getmessage(){
		return msg;
	}
}
//-----------------
class Registration{
	
	void vote(String name,int age) throws AgeInvalidException {
		if(age<18){
			System.out.println("Registration failed");
			throw new AgeInvalidException("Age should be >18");
		}
		else{
			System.out.println(name +"  registration Successfull");
		}
	}

	public static void main(String[] args) {
		Registration rg=new Registration();
		try {
			//rg.vote("aimee", 21);
			rg.vote("aimee", 15);

		} catch (AgeInvalidException e) {

		System.out.println(e.getmessage());
		}
	
}
}