package com.interface2.testyantra;

public class StaticMainMethodRef {
public static void name() {
	System.out.println("static method in normal class");
}
public static void add() {
	System.out.println("second static method");
}
public static void main(String[] args) {
	FunInterface funinterface = StaticMainMethodRef::name;
	funinterface.display();
}
}
