package com.technoelevate.collectionarraylist.myownimplementation;

import java.util.Iterator;
import java.util.HashSet;

public class TestHashSet {
private static Object Object;

public static void main(String[] args) {
	HashSet hashset = new HashSet();
	hashset.add(10);
	hashset.add(20);
	hashset.add(null);
	hashset.add(40);
	System.out.println(hashset);
	System.out.println("Length of the Object"+hashset.size());
	
	System.out.println("===========using for each loop===============");
	for(Object object : hashset) {
		System.out.println(object);
	}
	System.out.println("===============using iterator and iterator()===================");
	 Iterator iterator = hashset.iterator();
	 while (iterator.hasNext()) {
		 Object object = (Object) iterator.next();
		 System.out.println(object);
	 }
}
}
