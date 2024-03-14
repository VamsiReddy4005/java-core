package com.learning.core.day6;

import java.util.LinkedHashMap;
import java.util.Map;


public class D06P01 {
	public static void main(String[] args) {
	Map<String,Long> phoneBook=new LinkedHashMap<>();  //LinkedHashMap is used to maintain insertion order.
	phoneBook.put("Amal",998787823L);
	phoneBook.put("Manvitha",937843978L);
	phoneBook.put("Joseph",7882221113L);
	phoneBook.put("Smith",8293893311L);
	phoneBook.put("Kathe",7234560011L);
	for(Map.Entry<String,Long>entry:phoneBook.entrySet())
	{
		System.out.println(entry.getKey()+" "+entry.getValue());
	}
}
}
