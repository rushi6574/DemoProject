package com.rs.array;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		
		ArrayList<String>list= new ArrayList<String>();
		
		list.add("Vijay " );
		list.add("Vimla " );
		list.add("Vishnu " );
		
		for (String s: list) {
			System.out.println(s);
		}
		
		
	}

}
