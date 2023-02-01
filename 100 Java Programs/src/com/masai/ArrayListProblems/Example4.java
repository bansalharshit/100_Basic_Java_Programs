package com.masai.ArrayListProblems;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Example4 {
public static void main(String[] args) {
	ArrayList<String> list=new ArrayList<>();
	list.add("Ravi");
	list.add("Vijay");
	list.add("Ajay");
	
	try {
		// Serialization
		FileOutputStream fos=new FileOutputStream("file");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(list);
		fos.close();
		oos.close();
		
		// Deserialization
		ObjectInputStream ois=new ObjectInputStream(new FileInputStream("file"));
		ArrayList li=(ArrayList) ois.readObject();
		System.out.println(li);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
