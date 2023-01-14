package com.masai;

import java.io.IOException;

public class OpenNotePad {
public static void main(String[] args) {
	Runtime rs=Runtime.getRuntime();
	
	try {
		rs.exec("notepad");
	} catch (IOException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
}
}
