package com.foreachmethod.techno;

import java.util.ArrayList;

public class ForEachMethodDemo {
public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("mango");
	list.add("apple");
	list.add("orange");
	list.add("grapes");
	
	for(Object object : list) {
		System.out.println(object);
		
	}
	list.forEach(l->{System.out.println(1+" fruit");});
}
}
