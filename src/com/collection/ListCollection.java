package com.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCollection {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(20);
		System.out.println(li);
	
		for (int i = 0; i < li.size(); i++) {
			System.out.println(li.get(i));
		}
		for (Integer integer : li) {
			System.out.println(integer);
			
		}
	}

}
