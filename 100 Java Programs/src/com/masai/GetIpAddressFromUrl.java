package com.masai;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class GetIpAddressFromUrl {
public static void main(String[] args) {
	
	try {
		InetAddress ip=InetAddress.getByName("www.masaischool.com");
		System.out.println("Host Name "+ip.getHostName());
		System.out.println("Ip Address "+ip.getHostAddress());
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.out.println(e);
	}
}
}
