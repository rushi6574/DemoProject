package com.rs.array;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		HashMap<String,Integer>m=new HashMap<String,Integer>();
		m.put("Rushikesh", 101);
		m.put("Amol", 102);
		m.put("Rohit", 103);
		m.put("Ramesh", 104);
		
     Set<String> set = m.keySet();
		
     for (String s: set) {
    	 System.out.println(s);
     System.out.println(m.get(s));
     }
		
		
	}
	

}
