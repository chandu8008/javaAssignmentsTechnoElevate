package com.technoelevate.collectionarraylist.arraylistliterals;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList arraylist = new ArrayList();
		arraylist.add(10);
		arraylist.add(20);
		arraylist.add(30);
		arraylist.add(40);
		arraylist.add(50);
		arraylist.add(60);
		System.out.println(arraylist);
		System.out.println("============using for loop=========");
		for (int i = 0; i < arraylist.size(); i++) {
			System.out.println(arraylist.get(i));
		}
		System.out.println("===========using for each loop===============");
		for(Object object : arraylist) {
			System.out.println(object);
		}
		System.out.println("===============using iterator and iterator()===================");
		 Iterator iterator = arraylist.iterator();
		 while (iterator.hasNext()) {
			 Object object = (Object) iterator.next();
			 System.out.println(object);
		 }
	}
}
