package com.abstaract;

public abstract class  Student {
	Student(){
		System.out.println("student  constructor");
	}
	void test(){
		System.out.println("test1....");
	}

	 abstract void n();
	abstract void marks();
}

   class Sample extends Student{

	   @Override
		void n() {
	System.out.println("n method..");		
		}

		@Override
		void marks() {
	System.out.println("marks method..");		
		}
	  public static void main(String[] args) {
		  Student s=new Sample();//upcasting
		  s.test();
		  s.n();
		  s.marks();
	}

		
   }