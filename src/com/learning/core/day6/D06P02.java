package com.learning.core.day6;

import java.util.HashMap;
import java.util.Map;

public class D06P02 {
	public static void main(String[] args) {
		Map<String,Long> phoneBook=new HashMap<>();  
		phoneBook.put("Amal",998787823L);
		phoneBook.put("Manvitha",937843978L);
		phoneBook.put("Joseph",7882221113L);
		phoneBook.put("Smith",8293893311L);
		phoneBook.put("Kathe",7234560011L);
		String searchName="Joseph";
		Long phoneNumber=phoneBook.get(searchName); //get() method is used to retrieve the value associated with a specific key in the HashMap
		if(phoneNumber!=null)
		{
			System.out.println(phoneNumber);
		}
	}

}
