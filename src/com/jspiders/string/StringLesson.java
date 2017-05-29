package com.jspiders.string;

public class StringLesson {
	/*
	1.public class CharAtExample{  
	public static void main(String args[]){  
	String name="javatpoint";  
	char ch=name.charAt(4);//returns the char value at the 4th index  
	System.out.println(ch);  
	}}  


	2.Java String compareTo() method example

	public class LastIndexOfExample{  
	public static void main(String args[]){  
	String s1="hello";  
	String s2="hello";  
	String s3="meklo";  
	String s4="hemlo";  
	System.out.println(s1.compareTo(s2));  
	System.out.println(s1.compareTo(s3));  
	System.out.println(s1.compareTo(s4));  
	}} 

	 3.Java String concat() method example

	public class ConcatExample{  
	public static void main(String args[]){  
	String s1="java string";  
	s1.concat("is immutable");  
	System.out.println(s1);  
	s1=s1.concat(" is immutable so assign it explicitly");  
	System.out.println(s1);  
	}} 

	4. Java String contains() method example

	class ContainsExample{  
	public static void main(String args[]){  
	String name="what do you know about me";  
	System.out.println(name.contains("do you know"));  
	System.out.println(name.contains("about"));  
	System.out.println(name.contains("hello"));  
	}} 

	5.Java String endsWith() method example

	public class EndsWithExample{  
	public static void main(String args[]){  
	String s1="java by javatpoint";  
	System.out.println(s1.endsWith("t"));  
	System.out.println(s1.endsWith("point"));  
	}}  
	6.Java String equals() method example

	public class EqualsExample{  
	public static void main(String args[]){  
	String s1="javatpoint";  
	String s2="javatpoint";  
	String s3="JAVATPOINT";  
	String s4="python";  
	System.out.println(s1.equals(s2));//true because content and case is same  
	System.out.println(s1.equals(s3));//false because case is not same  
	System.out.println(s1.equals(s4));//false because content is not same  
	}}  

	7.Throws

	NullPointerException : if format is null.

	IllegalFormatException : if format is illegal or incompatible.

	Java String format() method example

	public class FormatExample{  
	public static void main(String args[]){  
	String name="sonoo";  
	String sf1=String.format("name is %s",name);  
	String sf2=String.format("value is %f",32.33434);  
	String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0  
	  
	System.out.println(sf1);  
	System.out.println(sf2);  
	System.out.println(sf3);  
	}}  

	8. 
	public byte[] getBytes()  
	public byte[] getBytes(Charset charset)  
	public byte[] getBytes(String charsetName)throws UnsupportedEncodingException 

	Java String getBytes() method example

	public class StringGetBytesExample{  
	public static void main(String args[]){  
	String s1="ABCDEFG";  
	byte[] barr=s1.getBytes();  
	for(int i=0;i<barr.length;i++){  
	System.out.println(barr[i]);  
	}  
	}}  
	9.
	Java String indexOf() method example

	public class IndexOfExample{  
	public static void main(String args[]){  
	String s1="this is index of example";  
	//passing substring  
	int index1=s1.indexOf("is");//returns the index of is substring  
	int index2=s1.indexOf("index");//returns the index of index substring  
	System.out.println(index1+"  "+index2);//2 8  
	  
	//passing substring with from index  
	int index3=s1.indexOf("is",4);//returns the index of is substring after 4th index  
	System.out.println(index3);//5 i.e. the index of another is  
	  
	//passing char value  
	int index4=s1.indexOf('s');//returns the index of s char value  
	System.out.println(index4);//3  
	}}  

	10.Java String intern() method example

	public class InternExample{  
	public static void main(String args[]){  
	String s1=new String("hello");  
	String s2="hello";  
	String s3=s1.intern();//returns string from pool, now it will be same as s2  
	System.out.println(s1==s2);//false because reference is different  
	System.out.println(s2==s3);//true because reference is same  
	}}  
	11.Java String isEmpty() method example

	public class IsEmptyExample{  
	public static void main(String args[]){  
	String s1="";  
	String s2="javatpoint";  
	  
	System.out.println(s1.isEmpty());  
	System.out.println(s2.isEmpty());  
	}}  
	12.Java String join() method example
	//Parameters

	//delimiter : char value to be added with each element

	//elements : char value to be attached with delimiter

	public class StringJoinExample{  
	public static void main(String args[]){  
	String joinString1=String.join("-","welcome","to","javatpoint");  
	System.out.println(joinString1);  
	}}  
	13.Java String valueOf() method example

	public class StringValueOfExample{  
	public static void main(String args[]){  
	int value=30;  
	String s1=String.valueOf(value);  
	System.out.println(s1+10);//concatenating string with 10  
	}}  
	14.Java String substring() method example

	public class SubstringExample{  
	public static void main(String args[]){  
	String s1="javatpoint";  
	System.out.println(s1.substring(2,4));//returns va  
	System.out.println(s1.substring(2));//returns vatpoint  
	}}  
	15.Java String startsWith() method example

	public class StartsWithExample{  
	public static void main(String args[]){  
	String s1="java string split method by javatpoint";  
	System.out.println(s1.startsWith("ja"));  
	System.out.println(s1.startsWith("java string"));  
	}}  
	*/
}
