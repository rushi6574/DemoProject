package com.rs.array;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer>set=new HashSet<>();
		set.add(10);
		set.add(52);
		set.add(42);
		set.add(12);
		
		Iterator<Integer> itr = set.iterator();
		
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	}
	}