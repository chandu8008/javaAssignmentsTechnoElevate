package com.technoelevate.collectionarraylist.myownimplementation;

import java.util.Iterator;
import java.util.LinkedList;

public class TestLinklist {
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.add(10);
		linkedlist.add(20);
		linkedlist.add(30);
		linkedlist.add(40);
		System.out.println(linkedlist);
		System.out.println("============using for loop=========");
		for (int i = 0; i < linkedlist.size(); i++) {
			System.out.println(linkedlist.get(i));
		}
		System.out.println("===========using for each loop===============");
		for(Object object : linkedlist) {
			System.out.println(object);
		}
		System.out.println("===============using iterator and iterator()===================");
		 Iterator iterator = linkedlist.iterator();
		 while (iterator.hasNext()) {
			 Object object = (Object) iterator.next();
			 System.out.println(object);
		 }
	}

}
