package com.jspiders.collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ACheck1{
	
		public static void main(String args[]){
			
			ALusingEmpObject s1=new ALusingEmpObject(403,"hindu");  
			ALusingEmpObject s2=new ALusingEmpObject(404,"sindhu");  
			ALusingEmpObject s3=new ALusingEmpObject(405,"bindhu");  
			      
			  ArrayList<Object> al=new ArrayList<Object>();//creating arraylist  
			  al.add(s1); 
			  al.add(s2);  
			  al.add(s3);  
			    
			  Iterator itr=al.iterator(); 
			  
			  
			  for (int i = 0; i <al.size(); i++) {
				System.out.println(al.get(i));
			}
			  
			  System.out.println("================");
			  
			  while(itr.hasNext()){ 
				  
				  //System.out.println(itr.next());
				  
				 ALusingEmpObject st=(ALusingEmpObject) itr.next(); 
				 
			    System.out.println(st.id+" "+st.name);  
			  }  
			 }  
			
}
