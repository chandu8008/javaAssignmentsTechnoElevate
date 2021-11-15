package com.technoelevate.collectioncomparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employeecollection {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("chandru", 308, 21));
		list.add(new Employee("chandru", 208, 20));
		list.add(new Employee("chandru", 108, 19));
		Collections.sort(list);
		System.out.println(list);
	}
}