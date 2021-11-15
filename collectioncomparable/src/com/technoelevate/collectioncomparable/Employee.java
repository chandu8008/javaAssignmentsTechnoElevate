package com.technoelevate.collectioncomparable;

public class Employee implements Comparable<Employee> {
	int id;
	String name;
	int age;

	public Employee(String name, int id, int age) {
		this.name = name;
		this.id = id;
		this.age = age;

	}

	@Override
	public int compareTo(Employee arg0) {
		return this.name.compareTo(arg0.name);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
