package com.jspiders.string;

public class Numbers {
public static void main(String[] args) {
	
	String s="hii dear.how r u?1234";
	
	char[] ch=s.toCharArray();
	
	for (int i = 0; i <ch.length; i++) {
		
		if ((ch[i]>=97&&ch[i]<=122)) {
			System.out.println(ch[i]);
		}
		else if(ch[i]<97){
			if((ch[i]!=' ')&&(ch[i]!='.')&&(ch[i]!='?'))
		
			System.out.print(ch[i]);
		}
	}
}
}
