package com.jspiders.recall;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Asdf {
public static void main(String[] args) throws UnknownHostException {
	String fg=InetAddress.getByName("192.18.97.39").getHostName();
	System.out.println(fg);
}
}
