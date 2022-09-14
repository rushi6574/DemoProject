package com.rs.array;

import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer>set=new HashSet<>();
		set.add(10);
		set.add(52);
		set.add(42);
		set.add(12);
		
		for (Integer s: set) {
			System.out.println(s);
		}
	}

}
