package com.technoelevate.collectioncomparable;

import java.util.Comparator;

public class ComparatorDemo implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		return arg1.age - arg0.age;
	}
}
